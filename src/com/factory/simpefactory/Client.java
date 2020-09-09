package com.factory.simpefactory;

/**
 * @author 周
 * @title Client
 * @description 没有工厂模式的情况下
 * @date 2020/6/4 22:28
 */
public class Client {
    public static void main(String[] args) {
        Car c1 = new Audi();
        Car c2 = new Byd();

        c1.run();
        c2.run();
    }
}
