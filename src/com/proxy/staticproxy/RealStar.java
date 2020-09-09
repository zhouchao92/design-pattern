package com.proxy.staticproxy;

/**
 * @author 周
 * @title RealStar
 * @description
 * @date 2020/6/7 19:29
 */
public class RealStar implements Star {
    @Override
    public void confer() {
        System.out.println("RealStar.confer");
    }

    @Override
    public void signContract() {
        System.out.println("RealStar.signContract");

    }

    @Override
    public void bookTicket() {
        System.out.println("RealStar.bookTicket");
    }

    @Override
    public void sing() {
        System.out.println("RealStar.sing");
    }

    @Override
    public void collectionMoney() {
        System.out.println("RealStar.collectionMoney");
    }
}
