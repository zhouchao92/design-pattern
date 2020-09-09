package com.state;

/**
 * @author 周
 * @title FreeState
 * @date 2020/6/13 11:17
 * @description
 */
public class FreeState implements State{
    @Override
    public void handle() {
        System.out.println("房间空闲...");
    }
}
