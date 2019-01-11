package com.ssm.alpay.controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.alipay.api.request.AlipayTradeWapPayRequest;
import com.google.gson.Gson;
import com.ssm.alpay.AlipayConfig;
import com.ssm.alpay.pojo.AlipayVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Controller
public class AlpayController {

    /**
     * 支付宝授权回调
     */
    @RequestMapping(value = "authorizeTheCallback")
    public String authorizeTheCallback(){
        System.out.println("授权回调");
        return "success";
    }

    /**
     * 异步回调
     * @param out_trade_no 商户订单号
     * @param trade_no 支付宝交易凭证号
     * @param trade_status 交易状态
     * @throws AlipayApiException
     * @return String
     * @throws
     */
    @RequestMapping(value = "anAsynchronousCallback")
    public String anAsynchronousCallback(HttpServletRequest request, String out_trade_no, String trade_no, String trade_status)
    throws AlipayApiException {
        Map<String, String> map = new HashMap<String, String>();
        Map<String, String[]> requestParams = request.getParameterMap();
        for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
            String name = iter.next();
            String[] values = requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i] : valueStr + values[i] + ",";
                System.out.println(valueStr);
            }
            map.put(name, valueStr);
        }
        boolean signVerified = false;
        try {
            signVerified = AlipaySignature.rsaCheckV1(map,AlipayConfig.ali_public_key,AlipayConfig.input_charset,AlipayConfig.sign_type);
        } catch (AlipayApiException e) {
            e.printStackTrace();
            return "error";// 验签发生异常,则直接返回失败
        }
        if (signVerified) {
            System.out.println("异步回调");
            return "success";
        } else {
            System.out.println("验证失败,不去更新状态");
            return "error";
        }
    }

    /**
     * 商户后台支付接口
     */
    @RequestMapping(value = "paymentInterface")
    @ResponseBody
    public String paymentInterface(){
        //这个应该是从前端端传过来的，这里为了测试就从后台写死了
        AlipayVo vo = new AlipayVo();
        vo.setOut_trade_no(UUID.randomUUID().toString().replace("-", ""));
        vo.setTotal_amount("0.01");
        vo.setSubject("nelson-test-title");
        vo.setProduct_code("FAST_INSTANT_TRADE_PAY"); //这个是固定的
        String json = new Gson().toJson(vo);

        AlipayClient alipayClient = new DefaultAlipayClient(
                AlipayConfig.URL,AlipayConfig.APPID,
                AlipayConfig.private_key,"json",AlipayConfig.input_charset,
                AlipayConfig.ali_public_key,AlipayConfig.sign_type);
        // 设置请求参数
        //手机支付
        AlipayTradeWapPayRequest alipayRequest = new AlipayTradeWapPayRequest();
        //网站支付
        //AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(AlipayConfig.return_url);
        alipayRequest.setNotifyUrl(AlipayConfig.notify_url);
        alipayRequest.setBizContent(json);
        String result = null;
        try {
            result = alipayClient.pageExecute(alipayRequest).getBody();
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
        return result; //这里生成一个表单，会自动提交
    }
}
