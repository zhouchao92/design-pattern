package com.strategy;

/**
 * @author 周
 * @title OldCustomerStrategy
 * @date 2020/6/12 21:10
 * @description
 */
public class OldCustomerMuchStrategy implements Strategy {

    @Override
    public double getPrice(double standardPrice) {
        System.out.println("8折");
        return standardPrice * 0.8;
    }
}
