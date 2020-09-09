package com.chain;

/**
 * @author 周
 * @title Leader
 * @date 2020/6/12 18:01
 * @description
 */
public abstract class Leader {
    protected String name;
    protected Leader nextLeader;    // 责任链上的对象

    public Leader(String name) {
        this.name = name;
    }

    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    /**
     * 处理请求核心的业务方法
     *
     * @param request
     */
    public abstract void handleRequest(LeaveRequest request);
}
