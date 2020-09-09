package com.facade;

/**
 * @author 周
 * @title Client
 * @date 2020/6/12 11:19
 * @description 测试外观模式
 */
public class Client {
    public static void main(String[] args) {
        new RegisterFacade().register();
    }
}
