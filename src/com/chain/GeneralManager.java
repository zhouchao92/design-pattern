package com.chain;

/**
 * @author 周
 * @title GeneralManager
 * @date 2020/6/12 18:08
 * @description 总经理审批请假
 */
public class GeneralManager extends Leader {

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDay() < 30) {
            System.out.println(request.getEmpName() + "请假，天数：" + request.getLeaveDay() + "  理由：" + request.getReason());
            System.out.println("总经理：" + name + "审批通过");
        } else {
            System.out.println("无人处理...");
        }
    }
}