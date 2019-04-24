package com.xa.userinfo.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

@RestController
public class RectController {
    @RequestMapping("/call/{username}-{password}")
    @ResponseBody
    public String call(@PathVariable("username")String username, @PathVariable("password")String password){
        System.out.println("用户名："+username+"\t密码："+password);
        return username+password;
    }


    @RequestMapping("/getCookieValue")
    @ResponseBody
    public String getCookieValue(@CookieValue(value="username",required=false) String username, @CookieValue(value="password",required=false) String password){
        return username+password;
    }

    @RequestMapping(value = "fileUpload",method = RequestMethod.POST)
    @ResponseBody
    public String fileUpload (@RequestParam("file") CommonsMultipartFile file) throws IOException {
        long startTime=new Date().getTime();
        System.out.println("fileName："+file.getOriginalFilename());
        String path="E:/"+new Date().getTime()+file.getOriginalFilename();
        File newFile=new File(path);
        file.transferTo(newFile);
        long  endTime=new Date().getTime();
        System.out.println("运行时间："+(endTime-startTime)+"ms");
        return "upload success";
    }

    @RequestMapping("/testDownload")
    @ResponseBody
    public ResponseEntity<byte[]> download() throws IOException {
        //创建文件
        File file = new File("D://a.txt");
        byte[] body = null;
        //创建输入流(从硬盘读取数据)
        InputStream is = new FileInputStream(file);
        //创建字节数组并指定长度
        body = new byte[is.available()];
        //将数据从输入流导到输出流
        is.read(body);
        //创建请求头并设置指定值
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "attchement;filename=" + file.getName());
        //设置HTTP响应状态。
        HttpStatus statusCode = HttpStatus.OK;
        //创建响应实体对象
        ResponseEntity<byte[]> entity = new ResponseEntity<byte[]>(body, headers, statusCode);
        return entity;
    }

    @RequestMapping("/getHeader")
    @ResponseBody
    public String getHeader(@RequestHeader(value = "User-Agent",required = false)String host){
        System.out.println(host);
        return host;
    }
}
