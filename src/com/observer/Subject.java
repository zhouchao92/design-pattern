package com.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 周
 * @title Subject
 * @date 2020/6/13 11:46
 * @description
 */
public class Subject {

    protected List<Observer> list = new ArrayList<>();

    public void register(Observer observer) {
        list.add(observer);
    }

    public void unregister(Observer observer) {
        list.remove(observer);
    }

    /**
     * 通知所有观察者更新状态
     */
    public void notifyAllObservers() {
        for (Observer observer : list) {
            observer.update(this);
        }
    }
}
