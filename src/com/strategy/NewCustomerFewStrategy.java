package com.strategy;

/**
 * @author 周
 * @title NewCustomerFewStrategy
 * @date 2020/6/12 21:08
 * @description
 */
public class NewCustomerFewStrategy implements Strategy {

    @Override
    public double getPrice(double standardPrice) {
        System.out.println("不打折");
        return standardPrice;
    }
}
