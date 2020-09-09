package com.builder;

/**
 * @author 周
 * @title Client
 * @description
 * @date 2020/6/6 15:59
 */
public class Client {
    public static void main(String[] args) {

        AirShipDirector director = new MyAirShipDirector(new MyAirShipBuilder());

        AirShip ship = director.directAirShip();

        System.out.println(ship.getEngine().getName());

        ship.launch();
    }

}
