package com.bridge;

/**
 * @author 周
 * @title Client
 * @date 2020/6/7 21:44
 * @description 测试桥接模式
 */
public class Client {
    public static void main(String[] args) {
        // 销售联想笔记本
        Computer2 c = new Laptop2(new Lenovo());
        c.sale();

        // 销售戴尔平板
        Computer2 c2=new Pad2(new Dell());
        c2.sale();
    }
}
