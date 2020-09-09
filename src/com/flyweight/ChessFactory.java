package com.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 周
 * @title ChessFactory
 * @date 2020/6/12 17:04
 * @description 享元工厂类
 */
public class ChessFactory {
    // 享元池
    private static Map<String, Chess> map = new HashMap<>();

    public static Chess getChess(String color) {
        if (map.get(color) != null) {
            return map.get(color);
        } else {
            Chess chess = new ConcreteChess(color);
            map.put(color, chess);
            return chess;
        }
    }

}
