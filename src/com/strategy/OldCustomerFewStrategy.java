package com.strategy;

/**
 * @author 周
 * @title OldCustomerFewStrategy
 * @date 2020/6/12 21:10
 * @description
 */
public class OldCustomerFewStrategy implements Strategy {

    @Override
    public double getPrice(double standardPrice) {
        System.out.println("85折");
        return standardPrice * 0.85;
    }
}
