package com.memento;

/**
 * @author 周
 * @title CareTaker
 * @date 2020/6/13 13:08
 * @description 负责人类
 * 负责管理备忘录对象
 */
public class CareTaker {
    private EmpMemento memento;

    public EmpMemento getMemento() {
        return memento;
    }

    public void setMemento(EmpMemento memento) {
        this.memento = memento;
    }
}
