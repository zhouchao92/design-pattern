package com.singleton;

/**
 * @author 周
 * @title LazySingleton
 * @date 2020/6/4 17:36
 * @description 懒汉式单例模式
 * 单例对象延迟加载，lazy load
 */
public class LazySingleton {

    // 类初始化时，不加载这个对象，延时加载，真正使用时再创建
    private static LazySingleton sInstance;

    /**
     * 私有化构造器
     */
    private LazySingleton() {
    }

    /**
     * 方法同步，调用效率低
     * @return
     */
    public static synchronized LazySingleton getInstance() {
        if (sInstance == null) {
            sInstance = new LazySingleton();
        }
        return sInstance;
    }
}
