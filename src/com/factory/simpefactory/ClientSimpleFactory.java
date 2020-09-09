package com.factory.simpefactory;

/**
 * @author 周
 * @title ClientSimpleFactory
 * @description
 * @date 2020/6/4 22:39
 */
public class ClientSimpleFactory {
    public static void main(String[] args) {
        Car c1 = CarFactory.createCar("Audi");
        Car c2 = CarFactory.createCar("Byd");

        c1.run();
        c2.run();
    }
}
