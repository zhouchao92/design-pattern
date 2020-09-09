package com.mediator;

/**
 * @author 周
 * @title Development
 * @date 2020/6/12 19:24
 * @description
 */
public class Development implements Department {

    private Mediator m; // 中介者的引用

    public Development(Mediator m) {
        this.m = m;
        m.register("development",this);
    }

    @Override
    public void selfAction() {
        System.out.println("开发项目");

    }

    @Override
    public void outAction() {
        System.out.println("汇报工作");
    }
}
