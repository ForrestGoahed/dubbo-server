package com.sht.service.impl;

import com.sht.service.service.SayHelloToClient;

/**
 * ClassName：
 * Description：
 * <p>company：58同城 <br>
 * Copyright：Copyright ? 2011 58.com All Rights Reserved<br>
 *
 * @author shaohongtao
 * @Date 2017/4/20 15:14
 * @since JRE 1.6.0_22  or higher
 */
public class SayHelloToClientImpl implements SayHelloToClient {
    public String sayHello(String hello) {
        System.out.println("我接收到了："+hello);
        return hello+"你也好啊！！！";
    }
}
