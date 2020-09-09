package com.observerjava;

/**
 * @author 周
 * @title Client
 * @date 2020/6/13 12:50
 * @description
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject=new ConcreteSubject();

        ObserverA obs1=new ObserverA();
        ObserverA obs2=new ObserverA();
        ObserverA obs3=new ObserverA();

        subject.addObserver(obs1);
        subject.addObserver(obs2);
        subject.addObserver(obs3);

        subject.set(1000);

        System.out.println("修改后观察者的状态值");

        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());
    }
}
