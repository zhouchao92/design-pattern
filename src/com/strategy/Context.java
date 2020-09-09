package com.strategy;

/**
 * @author 周
 * @title Context
 * @date 2020/6/12 21:12
 * @description 负责和具体的策略类交互
 * 具体的算法和直接得客户端调用分离，使得算法可以独立于客户端的变化
 */
public class Context {
    private Strategy strategy;  // 当前采用的算法

    /**
     * 通过构造器注入
     *
     * @param strategy 采用的策略
     */
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void printPrice(double price) {
        System.out.println("Price===>" + strategy.getPrice(price));
    }
}
