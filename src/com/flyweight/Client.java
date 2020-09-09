package com.flyweight;

/**
 * @author 周
 * @title Client
 * @date 2020/6/12 17:07
 * @description 测试享元模式
 */
public class Client {
    public static void main(String[] args) {
        Chess chess1 = ChessFactory.getChess("Black");
        Chess chess2 = ChessFactory.getChess("Black");

        System.out.println(chess1);
        System.out.println(chess2);

        chess1.display(new Coordinate(10, 10));
        chess2.display(new Coordinate(20, 20));
    }
}
