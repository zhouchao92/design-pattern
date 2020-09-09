package com.proxy.staticproxy;

/**
 * @author 周
 * @title ProxyStar
 * @description
 * @date 2020/6/7 19:31
 */
public class ProxyStar implements Star {

    private Star realStar;

    public ProxyStar(Star realStar) {
        super();
        this.realStar = realStar;
    }

    @Override
    public void confer() {
        System.out.println("ProxyStar.confer");
    }

    @Override
    public void signContract() {
        System.out.println("ProxyStar.signContract");
    }

    @Override
    public void bookTicket() {
        System.out.println("ProxyStar.bookTicket");
    }

    @Override
    public void sing() {
        realStar.sing();
    }

    @Override
    public void collectionMoney() {
        System.out.println("ProxyStar.collectionMoney");
    }
}
