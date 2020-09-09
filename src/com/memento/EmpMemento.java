package com.memento;

/**
 * @author 周
 * @title EmpMemento
 * @date 2020/6/13 13:04
 * @description 备忘录类
 */
public class EmpMemento {
    private String ename;
    private int age;
    private double salary;

    public EmpMemento(Emp e) {
        ename = e.getEname();
        age = e.getAge();
        salary = e.getSalary();
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
