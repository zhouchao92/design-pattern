package com.factory.factorymethod;

/**
 * @author 周
 * @title Client
 * @description
 * @date 2020/6/4 22:49
 */
public class Client {
    public static void main(String[] args) {
        Car c1 = new AudiFactory().createCar();
        Car c2 = new BydFactory().createCar();
        c1.run();
        c2.run();
    }
}
