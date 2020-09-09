package com.mediator;

/**
 * @author 周
 * @title Client
 * @date 2020/6/12 19:33
 * @description 测试中介者模式
 */
public class Client {
    public static void main(String[] args) {
        Mediator m = new President();

        Market market = new Market(m);
        Development dev = new Development(m);
        Financial f = new Financial(m);

        market.selfAction();
        market.outAction();
    }
}
