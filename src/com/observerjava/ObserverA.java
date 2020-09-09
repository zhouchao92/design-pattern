package com.observerjava;

import java.util.Observable;
import java.util.Observer;

/**
 * @author 周
 * @title ObserverA
 * @date 2020/6/13 12:48
 * @description
 */
public class ObserverA implements Observer {

    private int myState;

    @Override
    public void update(Observable o, Object arg) {
        // 修改状态
        myState=((ConcreteSubject)o).getState();
    }

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }
}
