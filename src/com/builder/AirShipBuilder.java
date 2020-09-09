package com.builder;

public interface AirShipBuilder {
    Engine buildEngine();

    OrbitalModule buildOrbitalModule();

    EscapeTower buildEscapeTower();
}
