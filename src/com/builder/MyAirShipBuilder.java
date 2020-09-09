package com.builder;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * @author 周
 * @title MyAirShipBuider
 * @description
 * @date 2020/6/6 15:51
 */
public class MyAirShipBuilder implements AirShipBuilder{

    @Override
    public Engine buildEngine() {
        System.out.println("构建发动机");
        return new Engine("Air ship engine");
    }

    @Override
    public OrbitalModule buildOrbitalModule() {
        System.out.println("构建轨道舱");
        return new OrbitalModule("Air ship orbital module");
    }

    @Override
    public EscapeTower buildEscapeTower() {
        System.out.println("构建逃生塔");
        return new EscapeTower("Air ship escape tower");
    }
}
