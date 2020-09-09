package com.state;

/**
 * @author 周
 * @title BookedState
 * @date 2020/6/13 11:17
 * @description
 */
public class BookedState implements State{
    @Override
    public void handle() {
        System.out.println("房间已预定...");
    }
}
