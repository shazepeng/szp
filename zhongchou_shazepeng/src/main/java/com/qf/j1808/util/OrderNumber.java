package com.qf.j1808.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class OrderNumber {
    public String doOrderNum(){
        Random random = new Random();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmSS");
        String subjectno = sdf.format(new Date())+random.nextInt(10);
        return subjectno+random.nextInt(10);
    }

    public static void main(String[] args) {
        OrderNumber orderNumber = new OrderNumber();
        String s = orderNumber.doOrderNum();
        System.out.println(s);

    }
}
