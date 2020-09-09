package com.factory.abstractfactory;

/**
 * @author 周
 * @title Client
 * @description
 * @date 2020/6/5 8:57
 */
public class Client {
    public static void main(String[] args) {
        CarFactory factory = new LuxuryCarFactory();

        Engine e = factory.createEngine();

        e.run();
        e.start();
    }
}
