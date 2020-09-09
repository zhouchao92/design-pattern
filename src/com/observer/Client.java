package com.observer;

/**
 * @author 周
 * @title Client
 * @date 2020/6/13 11:53
 * @description
 */
public class Client {
    public static void main(String[] args) {
        // 目标对象
        ConcreteSubject subject=new ConcreteSubject();

        // 创建多个观察者
        ObserverA obs1=new ObserverA();
        ObserverA obs2=new ObserverA();
        ObserverA obs3=new ObserverA();

        // 添加到目标对象的观察者列表中
        subject.register(obs1);
        subject.register(obs2);
        subject.register(obs3);

        // 打印观察者状态
        System.out.println("修改前=====>");
        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());

        // 改变subject的状态
        subject.setState(2000);
        System.out.println("修改后=====>");

        // 打印观察者状态
        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());
    }


}
