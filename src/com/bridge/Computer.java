package com.bridge;

/**
 * @author 周
 * @title Computer
 * @date 2020/6/7 21:25
 * @description 不使用桥接模式的结构
 */
public interface Computer {
    void sale();
}

class PC implements Computer {

    @Override
    public void sale() {
        System.out.println("销售PC");
    }
}

class Laptop implements Computer {

    @Override
    public void sale() {
        System.out.println("销售Laptop");
    }
}

class Pad implements Computer {

    @Override
    public void sale() {
        System.out.println("销售Pad");
    }
}

class LenovoPC extends PC {
    @Override
    public void sale() {
        System.out.println("联想台式电脑");
    }
}

class LenovoLaptop extends Laptop {
    @Override
    public void sale() {
        System.out.println("联想笔记本");
    }
}

class LenovoPad extends Pad {
    @Override
    public void sale() {
        System.out.println("联想平板");
    }
}