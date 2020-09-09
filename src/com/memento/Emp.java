package com.memento;

/**
 * @author 周
 * @title Emp
 * @date 2020/6/13 13:03
 * @description 源发器类
 */
public class Emp {
    private String ename;
    private int age;
    private  double salary;

    // 进行备忘操作
    public EmpMemento memento(){
        return new EmpMemento(this);
    }

    // 进行数据恢复，恢复成设定的备忘录对象的值
    public void recovery(EmpMemento memento){
        this.ename=memento.getEname();
        this.age=memento.getAge();
        this.salary=memento.getSalary();
    }


    public Emp(String ename, int age, double salary) {
        this.ename = ename;
        this.age = age;
        this.salary = salary;
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
