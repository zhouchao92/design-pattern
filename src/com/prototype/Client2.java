package com.prototype;

import java.util.Calendar;
import java.util.Date;

/**
 * @author 周
 * @title Client2
 * @description 测试原型模式
 * 深克隆
 * @date 2020/6/6 16:33
 */
public class Client2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date(96, Calendar.JULY, 5);
        Sheep2 s1 = new Sheep2("Dolly", date);
        Sheep2 s2 = (Sheep2) s1.clone();         // 实现深复制，s2对象的birthday是一个新对象
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
