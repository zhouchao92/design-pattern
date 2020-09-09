package com.singleton;

/**
 * @author 周
 * @title HungrySingleton
 * @date 2020/6/4 17:32
 * @description 饿汉式单例
 * 线程安全，不需要Synchronized关键字
 */
public class HungrySingleton {
    // 加载类时，天然的是线程安全的
    private static final HungrySingleton instance = new HungrySingleton();// 类初始化时，立即加载这个对象

    // 私有化构造器
    private HungrySingleton() {
    }

    // 方法没有同步，调用效率高
    public static HungrySingleton getInstance() {
        return instance;
    }
}
