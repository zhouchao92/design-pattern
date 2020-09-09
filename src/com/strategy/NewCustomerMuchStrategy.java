package com.strategy;

/**
 * @author 周
 * @title NewCustomerMuchStrategy
 * @date 2020/6/12 21:09
 * @description
 */
public class NewCustomerMuchStrategy implements Strategy {

    @Override
    public double getPrice(double standardPrice) {
        System.out.println("9折");
        return standardPrice * 0.9;
    }
}
