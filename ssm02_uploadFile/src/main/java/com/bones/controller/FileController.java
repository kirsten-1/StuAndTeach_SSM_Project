package com.bones.controller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
public class FileUploadController {
    //文件存储位置
    private final static String FILESERVER = "http://localhost:8090/upload/";
    @ResponseBody
    @RequestMapping("fileUpload.do")
    public Map<String,String> fileUpload(MultipartFile headPhoto, HttpServletRequest request) throws IOException {//MultipartFile：这个类主要是来实现以表单的形式进行文件上传功能，要借助前端的文件解析组件来完成
        Map<String,String> map = new HashMap<>();
        //指定文件存储目录为项目部署环境下的upload目录
        //给定一个URI，返回文件系统中URI对应的绝对路径。如果不能进行映射，返回null
        String realPath = request.getServletContext().getRealPath("/upload");
        //  指定文件的上传位置
        File dir = new File(realPath);
        //如果不存在则创建目录
        if (!dir.exists()){
            dir.mkdirs();
        }
        //获取文件名：
        String originalFilename = headPhoto.getOriginalFilename();
        //为了避免文件名冲突，使用UUID进行文件名替换
        String uuid = UUID.randomUUID().toString();
        //获取文件扩展名：
        String extendsName = originalFilename.substring(originalFilename.lastIndexOf("."));
        if (!extendsName.equals(".jpg")){
            map.put("message","文件类型必须是jpg");
            return map;
        }
        //新的文件名
        String newFileName = uuid.concat(extendsName);
        //创建sun公司提供的jersey包中的client对象
        Client client = Client.create();
        WebResource resource = client.resource(FILESERVER + newFileName);
        //将文件保存到文件服务器上去：
        resource.put(String.class,headPhoto.getBytes());

        //上传成功，将文件名和文件类型返回给浏览器
        map.put("message","上传成功");
        map.put("newFileName",newFileName);
        map.put("filetype",headPhoto.getContentType());
        return map;
    }
}
