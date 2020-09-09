package com.singleton;

/**
 * @author 周
 * @title StaticSingleton
 * @description 静态内部类实现单例模式
 * 外部类没有static属性，不会像懒汉式立即加载对象
 * 只有真正调用getInstance()，才会加载静态内部类，加载类时是线程安全的。static final保证线程安全性
 * 兼备了并发高效调用和延迟加载的优势
 * @date 2020/6/4 17:55
 */
public class StaticSingleton {

    private static class StaticSingletonClassInstance {
        private static final StaticSingleton sInstance = new StaticSingleton();
    }

    /**
     * 方法没有同步，调用效率高
     * @return
     */
    public static StaticSingleton getInstance() {
        return StaticSingletonClassInstance.sInstance;
    }

    private StaticSingleton() {

    }
}
