package com.factory.abstractfactory;

public interface CarFactory {
    Engine createEngine();

    Seat creatSeat();

    Tire creatTire();
}
