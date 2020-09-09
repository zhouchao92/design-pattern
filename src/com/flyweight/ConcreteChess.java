package com.flyweight;

/**
 * @author 周
 * @title ConcreteChess
 * @date 2020/6/12 17:08
 * @description 享元实体对象
 */
class ConcreteChess implements Chess {

    private String color;


    public ConcreteChess(String color) {
        this.color = color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void display(Coordinate c) {
        System.out.println("棋子颜色==>" + color);
        System.out.println("棋子位置==>" + c.getX() + "  " + c.getY());
    }
}
