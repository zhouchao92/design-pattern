package com.observer;

/**
 * @author 周
 * @title ConcreteSubject
 * @date 2020/6/13 11:49
 * @description
 */
public class ConcreteSubject extends Subject {
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;

        // 目标对象值发生变化，通知所有观察者
        this.notifyAllObservers();
    }

}
