package com.bridge;

/**
 * @author 周
 * @title Computer2
 * @date 2020/6/7 21:41
 * @description
 */
public class Computer2 {
    protected Brand brand;

    public Computer2(Brand brand) {
        this.brand = brand;
    }

    public void sale() {
        brand.sale();
    }
}

class PC2 extends Computer2 {

    public PC2(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("销售台式机");
    }
}

class Laptop2 extends Computer2 {

    public Laptop2(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("销售笔记本");
    }
}

class Pad2 extends Computer2 {

    public Pad2(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("销售平板");
    }
}