package com.factory.abstractfactory;

public interface Engine {
    void run();

    void start();
}

class LuxuryEngine implements Engine {

    @Override
    public void run() {
        System.out.println("Fast speed.");
    }

    @Override
    public void start() {
        System.out.println("Start fast.");
    }
}

class LowEngine implements Engine {

    @Override
    public void run() {
        System.out.println("Slow speed.");
    }

    @Override
    public void start() {
        System.out.println("Start slowly.");

    }
}