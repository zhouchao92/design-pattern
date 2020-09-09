package com.observerjava;

import java.util.Observable;

/**
 * @author 周
 * @title ConcreteSubject
 * @date 2020/6/13 12:46
 * @description
 */
public class ConcreteSubject extends Observable {
    private int state;

    public void set(int s) {
        state = s;

        setChanged();   // 目标对象已被修改

        notifyObservers(state); // 通知所有观察者
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
