package com.strategy;

/**
 * @author 周
 * @title Client
 * @date 2020/6/12 21:16
 * @description 测试策略模式
 */
public class Client {
    public static void main(String[] args) {
        Strategy s1 = new OldCustomerMuchStrategy();
        Context ctx = new Context(s1);

        ctx.printPrice(998);
    }
}
