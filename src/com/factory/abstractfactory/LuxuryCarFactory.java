package com.factory.abstractfactory;

/**
 * @author 周
 * @title LuxuryCarFactory
 * @description
 * @date 2020/6/5 8:54
 */
public class LuxuryCarFactory implements CarFactory {
    @Override
    public Engine createEngine() {

        return new LuxuryEngine();
    }

    @Override
    public Seat creatSeat() {

        return new LuxurySeat();
    }

    @Override
    public Tire creatTire() {

        return new LuxuryTire();
    }
}
