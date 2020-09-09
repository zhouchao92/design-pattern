package com.chain;

/**
 * @author 周
 * @title Director
 * @date 2020/6/12 18:04
 * @description 主任审批请假
 */
public class Director extends Leader {

    public Director(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDay() < 3) {
            System.out.println(request.getEmpName() + "请假，天数：" + request.getLeaveDay() + "  理由：" + request.getReason());
            System.out.println("领导" + name + "审批通过");
        } else {
            if (this.nextLeader != null) {
                this.nextLeader.handleRequest(request);
            }
        }
    }
}
