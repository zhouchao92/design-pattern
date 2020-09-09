package com.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author 周
 * @title StarHandler
 * @description
 * @date 2020/6/7 20:22
 */
public class StarHandler implements InvocationHandler {

    Star realStar;

    public StarHandler(Star realStar) {
        this.realStar = realStar;
    }

    /**
     * 对对象，方法集中处理
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object object = null;
        System.out.println("面谈");
        System.out.println("签约");
        System.out.println("购票");
        // 真实对象执行
        if (method.getName().equals("sing")) {
            object = method.invoke(realStar, args);
        }
        System.out.println("收钱");
        return object;
    }
}
