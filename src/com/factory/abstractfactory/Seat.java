package com.factory.abstractfactory;

public interface Seat {
    void massage();
}

class LuxurySeat implements Seat {

    @Override
    public void massage() {
        System.out.println("Can massage.");
    }
}

class LowSeat implements Seat {

    @Override
    public void massage() {
        System.out.println("Can't massage.");
    }
}