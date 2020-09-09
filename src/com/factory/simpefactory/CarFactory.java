package com.factory.simpefactory;

/**
 * @author 周
 * @title CarFactory
 * @description 简单工厂模式
 * @date 2020/6/4 22:34
 */
public class CarFactory {
    public static Car createCar(String type) {
        if ("Audi".equals(type)) {
            return new Audi();
        } else if ("Byd".equals(type)) {
            return new Byd();
        } else {
            return null;
        }
    }

    /**
     * 另一种方式
     */
    public static Car createAudi() {
        return new Audi();
    }

    public static Car createByd() {
        return new Byd();
    }
}
