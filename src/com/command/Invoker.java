package com.command;

/**
 * @author 周
 * @title Invoker
 * @date 2020/6/12 20:31
 * @description 调用者/发起者
 */
public class Invoker {
    private Command command;    // 也可通过容器List<Command>

    public Invoker(Command command) {
        this.command = command;
    }

    /**
     * 调用命令类的方法
     */
    public void call() {
        command.execute();
    }


}
