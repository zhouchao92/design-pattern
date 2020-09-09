package com.memento;

/**
 * @author 周
 * @title Client
 * @date 2020/6/13 13:09
 * @description
 */
public class Client {
    public static void main(String[] args) {
        CareTaker taker=new CareTaker();

        Emp emp=new Emp("周",20,1000);

        System.out.println("第一次==>"+emp.getEname()+"  "+emp.getAge()+"  "+emp.getSalary());

        taker.setMemento(emp.memento());

        emp.setAge(22);
        emp.setSalary(2000);
        System.out.println("第二次==>"+emp.getEname()+"  "+emp.getAge()+"  "+emp.getSalary());

        // 恢复
        emp.recovery(taker.getMemento());

        System.out.println("第三次==>"+emp.getEname()+"  "+emp.getAge()+"  "+emp.getSalary());


    }
}
