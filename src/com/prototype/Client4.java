package com.prototype;

/**
 * @author 周
 * @title Client4
 * @description 测试new方式和clone方式创建对象的效率差异
 * 如果需要短时间创建大量对象，clone方式比new方式好
 * @date 2020/6/6 19:04
 */
public class Client4 {
    public static void main(String[] args) throws CloneNotSupportedException {
        testNew(1000);
        testClone(1000);
    }

    public static void testNew(int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            Laptop t = new Laptop();
        }
        long end = System.currentTimeMillis();
        System.out.println("test new spent +" + (end - start));
    }

    public static void testClone(int size) throws CloneNotSupportedException {
        long start = System.currentTimeMillis();
        Laptop t = new Laptop();
        for (int i = 0; i < size; i++) {
            Laptop lt = (Laptop) t.clone();
        }
        long end = System.currentTimeMillis();
        System.out.println("test clone spent +" + (end - start));
    }
}

class Laptop implements Cloneable {

    public Laptop() {
        try {
            Thread.sleep(10);   // 模拟创建对象的过程
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
