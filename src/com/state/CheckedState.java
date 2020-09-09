package com.state;

/**
 * @author 周
 * @title CheckedState
 * @date 2020/6/13 11:18
 * @description
 */
public class CheckedState implements State{
    @Override
    public void handle() {
        System.out.println("房间已入住...");
    }
}
