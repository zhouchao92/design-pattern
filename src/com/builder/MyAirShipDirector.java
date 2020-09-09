package com.builder;

/**
 * @author 周
 * @title MyAirShipDirector
 * @description
 * @date 2020/6/6 15:57
 */
public class MyAirShipDirector implements AirShipDirector {

    private AirShipBuilder builder;

    public MyAirShipDirector(AirShipBuilder builder) {
        this.builder = builder;
    }

    @Override
    public AirShip directAirShip() {
        Engine e = builder.buildEngine();
        OrbitalModule o = builder.buildOrbitalModule();
        EscapeTower et = builder.buildEscapeTower();
        AirShip ship = new AirShip();
        ship.setEngine(e);
        ship.setOrbitalModule(o);
        ship.setEscapeTower(et);

        return ship;
    }
}
