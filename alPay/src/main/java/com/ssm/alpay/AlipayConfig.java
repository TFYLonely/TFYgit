package com.ssm.alpay;

public class AlipayConfig {
    //商户ID
    public static String partner = "2088102177210355";
    // 商户appid
    public static String APPID = "2016092500593345";
    // 私钥 pkcs8格式的
    public static String private_key = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQDb6FBmNVW4iY1sgbFvl9c31C+MlxaFOVTYlFRx+SxuT+FMbM8FinEz0ezLUgq734GynGqaskfbQhuNKMjDe17NxmkM1xvQffjzR67Pwk6YnPI7TPxz4c1XCZ+5ADIaNcUNqQ4UYg0I2UsfTBuoTaVhpBRjGj+fYXJZkAYz21ieY7JfDu3J2bWmxI2AUgkEprpVtUzpLqbutuuBONW7NV6dyc3UuKuKkkgj+6gjwq2RYWU6qTbB8BMMSzKiG1U+b0oBztErcJ63tVpRIFbtOD3Bgc0VbaafKjN907HL0+t7d9xyIWrCOefO0TvfvqpnTcLvq6kUenirOAo+w32O7r6vAgMBAAECggEBALAOCXAKexpGZYbdPiTNN2xm37p6q3j1MUxDVGf6yOt34DPDWOpir8aA5kbQ4+8NPVS1jVNUL9sFzfDxGeoGtxufITM6c/YzJEAAv59tPGdKH1QCiopr2G06Mzl1QqdhLOWG1tLSvQS8kjv4Ppw7rY/CQOAmf5El/tpdR9n0XbpPMlE3F8F1azoeaEYy7pnVi3pXTbzlFcSiy/KAsBaj7c9FWfvj7QGW1j/LZbRO3F5lRKfD7DdPf21dstkBMgAEK+2m9z8OakEnduZzEgNOEGLIGemqfN6q/45xPAc2QuyLYL6N+KvskG89t3/BPdEf6IWIiopxxBZ2UOA7zlFJAYECgYEA+0DHN3VX6uTvD55kfOdrJmb0nAS6F50QdQE1RU3ZOx+kv6oooUUxRpW9qEBYAzVMyPJJcyf/0MHZJZVJk6B22QmqPFHKQUXIs7fZNoCZVHFiTWlZ+w6ppQ0RzRNIMN8KM1vt67uY6IzKFtdujz6ehk0c0YK1ZgrYOsqf2SJR1L8CgYEA4A/tsliUi0+OUoN4nn7Bup19xJpvMwQqlntErbmXhpAupsLNg2JNqnWfp1K8ptIv9TwOZjLGXONGZCPFTz5ZB40KdrnjXiFU7ZJM/7jpNnpL0VI9XWoEFnvqxM8YjPynXW5EPsmOJGsolTUAoGg46zlWpztKPfjK4clxdlcR4hECgYB5y3AG4ToqIqoEPzrlFWVqqzPeQahX9ApbPaeuHcu1DmTViE3Dx3/YgJP8cJx5iafcLR8P1I78ikuSHWkaSAn0seu0680IkSR2giOoePRa68/ESNKWkggIe2pqp/MxxZzzQpf10u2PpVf9dJcily9PWSgkI6F9grpI3ZpZLnrOjwKBgQDfdQNJ6q26gg0enZ+d8iyjQI49lQdxiaYvjaBg4ccMnJ7qET2E2nU6mzQuW4VpmhXaLZrusZTC7qc1F7ef4D5KGY9l+N2Y8wUQKehA4Nk1S6Jxj+NDVofdJJhuz1tcwFzqAR5uv/TSvUwsAkAtucOKVBTnk2nnhEhSBeTycMOVAQKBgQD4Yc47gw5P3xHLuyzhJZzlT9x4tTo6x9W1GJrsKiGVXRleUOGfth2cmAKIE6oazFEVTkvUrJb4z38gTvtuQrd/HkhHAK7xg+f0poQ/T9k31s/exVkxOCuRa7O417VgnGbuExb4XkQ0lEkO8iSRi38CpdT+1AbW0oky84WMBaoTGA==";
    // 服务器异步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://8i53bs.natappfree.cc/anAsynchronousCallback";
    // 页面跳转同步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问 商户可以自定义同步跳转地址
    public static String return_url = "http://8i53bs.natappfree.cc/authorizeTheCallback";
    // 请求网关地址
    public static String URL = "https://openapi.alipaydev.com/gateway.do";
    // 编码
    public static String input_charset = "UTF-8";
    // 返回格式
    public static String FORMAT = "json";
    // 支付宝公钥
    public static String ali_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAw4oE4KRFLTdkDLnMgjI6+e76qprF5Ersqmh0iO/OR/o+K7pMClI1+1bzEUZoKqrqCdmregleCrG9GCPtwwxM0Dl4mObHtjztntWrd4UcNWUpOB75mTZbf7fsiSdrzAUbf61zpPO+KOG5qVoe3rB/poy4ChWoKpUcQawxbTSmnTCz5xP+NDeqe38o708CFwvm3F9pq2mnZ5RuJ1Pt0/XSYwLcZVxjBIUHqkZmurhS6fFyR9WIuTzvEgG5s8xs7zLkVVLKNUNGXADHqjupjaGSO0FeloHk4rf/Fa0pBDKJK+/1MCFFR+IE/kovkEeP4ltEL8oLIiJudJdg4AgGDyb6PQIDAQAB";
    // 日志记录目录
    public static String log_path = "/log";
    // RSA2
    public static String sign_type = "RSA2";
}
