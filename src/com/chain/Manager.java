package com.chain;

/**
 * @author 周
 * @title Manager
 * @date 2020/6/12 18:07
 * @description 经理审批请假
 */
public class Manager extends Leader {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDay() < 10) {
            System.out.println(request.getEmpName() + "请假，天数：" + request.getLeaveDay() + "  理由：" + request.getReason());
            System.out.println("经理：" + name + "审批通过");
        } else {
            if (this.nextLeader != null) {
                this.nextLeader.handleRequest(request);
            }
        }
    }
}