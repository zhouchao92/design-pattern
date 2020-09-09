package com.prototype;

import java.util.Date;

/**
 * @author 周
 * @title Sheep
 * @description 原型模式
 * @date 2020/6/6 16:16
 */
public class Sheep2 implements Cloneable {
    private String sname;
    private Date birthday;

    public Sheep2() {

    }

    public Sheep2(String sname, Date birthday) {
        this.sname = sname;
        this.birthday = birthday;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone(); // 直接调用object对象的clone()方法
        // 实现深复制
        Sheep2 sheep = (Sheep2) obj;
        sheep.birthday = (Date) this.birthday.clone();  // 将属性也进行克隆

        return obj;
    }

}