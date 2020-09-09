package com.facade;

/**
 * @author 周
 * @title Bank
 * @date 2020/6/12 11:12
 * @description 模拟银行开户
 */
public interface Bank {
    void openAccount();     // 开户
}

class ChinaBank implements Bank {

    @Override
    public void openAccount() {
        System.out.println("银行开户.");
    }
}
