package com.command;

/**
 * @author 周
 * @title Client
 * @date 2020/6/12 20:33
 * @description
 */
public class Client {
    public static void main(String[] args) {
        // 构造命令对象
        Command c = new ConcreteCommand(new Receiver());

        Invoker invoker = new Invoker(c);

        invoker.call();

        // new Receiver().action();
    }
}
