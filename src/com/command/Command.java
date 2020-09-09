package com.command;

/**
 * @author 周
 * @title Command
 * @date 2020/6/12 20:28
 * @description 命令接口
 */
public interface Command {

    /**
     * 根据需求来设计
     */
    void execute();

}

class ConcreteCommand implements Command {

    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        // 命令执行前
        receiver.action();
    }
}
