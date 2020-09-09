package com.factory.abstractfactory;

public interface Tire {
    void revolve();
}

class LuxuryTire implements Tire {

    @Override
    public void revolve() {
        System.out.println("Luxury tires.");
    }
}

class LowTire implements Tire {

    @Override
    public void revolve() {
        System.out.println("Low tires.");
    }
}