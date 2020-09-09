package com.bridge;

/**
 * @author 周
 * @title Brand
 * @date 2020/6/7 21:39
 * @description
 */
public interface Brand {
    void sale();
}
class Lenovo implements Brand{

    @Override
    public void sale() {
        System.out.println("销售联想电脑");
    }
}
class Dell implements Brand{

    @Override
    public void sale() {
        System.out.println("销售戴尔电脑");
    }
}