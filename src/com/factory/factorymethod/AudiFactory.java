package com.factory.factorymethod;

/**
 * @author 周
 * @title AudiFactory
 * @description
 * @date 2020/6/4 22:48
 */
public class AudiFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Audi();
    }
}
