package com.mediator;

/**
 * @author 周
 * @title Financial
 * @date 2020/6/12 19:26
 * @description
 */
public class Financial implements Department {

    private Mediator m;

    public Financial(Mediator m) {
        this.m = m;
        m.register("financial", this);
    }

    @Override
    public void selfAction() {
        System.out.println("财务管理");
    }

    @Override
    public void outAction() {
        System.out.println("财务汇报");
    }
}
