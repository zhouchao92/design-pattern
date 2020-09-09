package com.facade;

/**
 * @author 周
 * @title RegisterFacade
 * @date 2020/6/12 10:57
 * @description 办理注册公司的门面对象
 */
public class RegisterFacade {
    public void register() {
        // 相关流程
        IndustryCommerce businessOffice = new BusinessOffice();
        businessOffice.checkName();

        Tax tax = new TaxOffice();
        tax.registerCertificate();

        Bank bank = new ChinaBank();
        bank.openAccount();

    }
}
