package com.state;

/**
 * @author 周
 * @title Context
 * @date 2020/6/13 11:19
 * @description 房间对象
 */
public class Context {

    private State state;

    public void setState(State state) {
        System.out.println("修改状态");
        this.state = state;
        state.handle();
    }
}
