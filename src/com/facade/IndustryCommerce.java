package com.facade;

/**
 * @author 周
 * @title IndustryCommerce
 * @date 2020/6/12 11:10
 * @description 模拟工商局
 */
public interface IndustryCommerce {
    void checkName();   // 核名
}

class BusinessOffice implements IndustryCommerce {

    @Override
    public void checkName() {
        System.out.println("审查公司名是否冲突.");
    }
}