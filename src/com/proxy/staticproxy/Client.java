package com.proxy.staticproxy;

/**
 * @author 周
 * @title Client
 * @description
 * @date 2020/6/7 19:33
 */
public class Client {
    public static void main(String[] args) {
        Star real = new RealStar();
        Star proxy = new ProxyStar(real);

        proxy.confer();
        proxy.signContract();
        proxy.bookTicket();
        proxy.sing();
        proxy.collectionMoney();
    }
}
