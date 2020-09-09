package com.factory.factorymethod;

/**
 * @author 周
 * @title BydFactory
 * @description
 * @date 2020/6/4 22:49
 */
public class BydFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Byd();
    }
}
