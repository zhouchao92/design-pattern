package com.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * @author 周
 * @title Client
 * @description 基于反射的Proxy动态代理对象
 * @date 2020/6/7 20:24
 */
public class Client {
    public static void main(String[] args) {
        Star realStar = new RealStar();

        StarHandler handler = new StarHandler(realStar);

        Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, handler);

        // proxy.bookTicket();

        proxy.sing();

    }
}
