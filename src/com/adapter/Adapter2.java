package com.adapter;

/**
 * @author 周
 * @title Adapter2
 * @description 适配器
 * 对象适配器的方式，使用了组合的方式根被适配对象整合
 * @date 2020/6/7 19:04
 */
public class Adapter2 implements Target {

    private Adaptee adaptee;

    @Override
    public void handleReq() {
        adaptee.request();
    }

    public Adapter2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
}
