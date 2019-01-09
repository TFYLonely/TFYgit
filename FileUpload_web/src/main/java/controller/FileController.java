package controller;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * 文件上传处理类
 *
 */
@Controller
public class FileController {
    /**
     * 上传单个文件操作
     * @param
     * @return
     */
    @RequestMapping(value="/doUpload", method= RequestMethod.POST)
    public String doUploadFile(@RequestParam("file") MultipartFile file){

        if(!file.isEmpty()){
            try {
                //这里将上传得到的文件保存至 d:\\temp\\file 目录
                FileUtils.copyInputStreamToFile(file.getInputStream(), new File("D:\\temp\\file\\",
                        System.currentTimeMillis()+ file.getOriginalFilename()));
            }catch (IOException e) {
                e.printStackTrace();
                return "error";
            }
            return "success";  //上传成功则跳转至此success.jsp页面
        }else{
            return "error";
        }
    }


    @RequestMapping(value="/fileUpload")
    public String showUploadPage(){
        return "fileUpload";		 //view文件夹下的上传单个文件的页面
    }

    @RequestMapping(value="/multipleFileupload")
    public String multipleFilesUploadPage(){
        return "multipleFilesUpload";		 //view文件夹下的上传多个文件的页面
    }

}