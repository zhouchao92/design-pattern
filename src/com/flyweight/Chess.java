package com.flyweight;

/**
 * @author 周
 * @title Chess
 * @date 2020/6/12 16:58
 * @description 享元类
 */
public interface Chess {
    void setColor(String color);

    String getColor();

    void display(Coordinate c);

}

