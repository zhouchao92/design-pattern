package com.templatemethod;

/**
 * @author 周
 * @title Client
 * @date 2020/6/13 10:52
 * @description
 */
public class Client {
    public static void main(String[] args) {
        BankTemplateMethod btm = new DrawMoney();
        btm.process();

        // 采用匿名内部类
        BankTemplateMethod btm2 = new BankTemplateMethod() {
            @Override
            public void transact() {
                System.out.println("存钱");
            }
        };
        btm2.process();

    }
}


class DrawMoney extends BankTemplateMethod {

    @Override
    public void transact() {
        System.out.println("取钱");
    }
}