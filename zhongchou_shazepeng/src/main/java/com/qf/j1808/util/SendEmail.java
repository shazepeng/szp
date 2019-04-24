package com.qf.j1808.util;

import org.apache.commons.mail.HtmlEmail;

import java.util.Random;

public class SendEmail {

    //邮箱验证码
    public static String sendEmail(String emailaddress){
        try {
            Random random = new Random();
            int i = random.nextInt(8999)+1000;
            String code = i + "";

            HtmlEmail email = new HtmlEmail();//不用更改
            email.setHostName("smtp.qq.com");//需要修改，126邮箱为smtp.126.com,163邮箱为163.smtp.com，QQ为smtp.qq.com
            email.setCharset("UTF-8");
            email.addTo(emailaddress);// emailaddress收件地址
            email.setFrom("212314642@qq.com", "aa");//此处填发件邮箱地址和用户名,用户名可以任意填写
            email.setAuthentication("212314642@qq.com", "ktaaodoabbxfbhjc");//发件邮箱和授权码
            email.setSubject("千锋众筹");//此处填写邮件名，邮件名可任意填写
            email.setMsg("尊敬的用户您好,您本次的验证码是:" + code);//此处填写邮件内容
            email.send();
            return code;
        }
        catch(Exception e){
            e.printStackTrace();
            return "false";
        }
    }
}
