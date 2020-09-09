package com.mediator;

/**
 * @author 周
 * @title Market
 * @date 2020/6/12 19:29
 * @description
 */
public class Market implements Department {

    private Mediator m;

    public Market(Mediator m) {
        this.m = m;
        m.register("market", this);
    }

    @Override
    public void selfAction() {
        System.out.println("采购");
    }

    @Override
    public void outAction() {
        System.out.println("市场营销汇报");
        m.command("financial");
    }
}
