package com.facade;

/**
 * @author 周
 * @title Tax
 * @date 2020/6/12 11:12
 * @description 模拟税务局注册税务等级证
 */
public interface Tax {
    void registerCertificate(); // 注册税务登记证
}

class TaxOffice implements Tax{

    @Override
    public void registerCertificate() {
        System.out.println("注册税务等级证.");
    }
}