package com.mediator;

/**
 * @author 周
 * @title Mediator
 * @date 2020/6/12 19:21
 * @description
 */
public interface Mediator {
    void register(String dname, Department d);

    void command(String dname);
}
