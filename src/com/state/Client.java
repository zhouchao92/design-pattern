package com.state;

/**
 * @author 周
 * @title Client
 * @date 2020/6/13 11:21
 * @description
 */
public class Client {
    public static void main(String[] args) {
        Context ctx = new Context();

        ctx.setState(new FreeState());

        ctx.setState(new BookedState());
    }
}
