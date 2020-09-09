package com.factory.abstractfactory;

/**
 * @author 周
 * @title LowCarFactory
 * @description
 * @date 2020/6/5 8:56
 */
public class LowCarFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new LowEngine();
    }

    @Override
    public Seat creatSeat() {
        return new LowSeat();
    }

    @Override
    public Tire creatTire() {
        return new LowTire();
    }
}
