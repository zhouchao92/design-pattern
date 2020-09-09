package com.prototype;

import java.util.Calendar;
import java.util.Date;

/**
 * @author 周
 * @title Client
 * @description 测试原型模式
 * 浅克隆：属性指向同一对象，仍有关联
 * @date 2020/6/6 16:22
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date(96, Calendar.JULY, 5);
        Sheep s1 = new Sheep("Dolly", date);
        Sheep s2 = (Sheep) s1.clone();
        System.out.println(s1);
        System.out.println(s1.getSname());
        System.out.println(s1.getBirthday());
        date.setHours(12);
        System.out.println(s1.getBirthday());


        System.out.println(s2);
        System.out.println(s2.getSname());
        System.out.println(s2.getBirthday());
    }
}
