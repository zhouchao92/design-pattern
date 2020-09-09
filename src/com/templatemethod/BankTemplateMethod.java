package com.templatemethod;

/**
 * @author 周
 * @title BankTemplateMethod
 * @date 2020/6/13 10:49
 * @description
 */
public abstract class BankTemplateMethod {
    public void takeNumber() {
        System.out.println("取号排队");
    }

    public abstract void transact();    // 处理业务，由子类实现

    public void evaluate() {
        System.out.println("反馈评分");
    }

    public final void process() {
        this.takeNumber();

        this.transact();

        this.evaluate();
    }
}
