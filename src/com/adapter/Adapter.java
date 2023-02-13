package com.adapter;

/**
 * @author 周
 * @title Adapter
 * @description 适配器，被适配对象与接口建立联系
 * 类适配器
 * @date 2020/6/7 18:58
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void handleReq() {
        super.request();
    }
}
