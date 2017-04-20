package com.sht.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName：
 * Description：
 * <p>company：58同城 <br>
 * Copyright：Copyright ? 2011 58.com All Rights Reserved<br>
 *
 * @author shaohongtao
 * @Date 2017/4/20 15:20
 * @since JRE 1.6.0_22  or higher
 */
public class MyMain {

    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationProvider.xml"});

        context.start();
        System.out.println("按任意键退出");
        System.in.read();
    }
}
