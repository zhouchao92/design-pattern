package com.factory.factorymethod;

/**
 * @author 周
 * @title BenzFactory
 * @description
 * @date 2020/6/4 22:52
 */
public class BenzFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Benz();
    }
}
