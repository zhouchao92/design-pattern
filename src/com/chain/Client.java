package com.chain;

/**
 * @author 周
 * @title Client
 * @date 2020/6/12 18:10
 * @description 测试责任链模式
 */
public class Client {
    public static void main(String[] args) {
        Leader a = new Director("张");
        Leader b = new Manager("李");
        Leader c = new GeneralManager("王");

        // 设置责任链关系
        a.setNextLeader(b);
        b.setNextLeader(c);

        // 开始实际操作
        LeaveRequest request1 = new LeaveRequest("Tom", 10, "Go back England.");
        LeaveRequest request2 = new LeaveRequest("John", 1, "See a doctor.");

        a.handleRequest(request1);
        a.handleRequest(request2);

    }
}
