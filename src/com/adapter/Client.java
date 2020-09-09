package com.adapter;

/**
 * @author 周
 * @title Client
 * @description 客户端，只能使用指定接口
 * @date 2020/6/7 18:56
 */
public class Client {
    public void test1(Target t) {
        t.handleReq();
    }

    public static void main(String[] args) {
        Client c = new Client();

        Adaptee a = new Adaptee();

        // Target t = new Adapter();
        Target t = new Adapter2(a);

        c.test1(t);

    }

}
