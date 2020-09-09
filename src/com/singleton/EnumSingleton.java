package com.singleton;

/**
 * @author 周
 * @title EnumSingleton
 * @description 枚举实现单例模式
 * 枚举本身就是一个单例模式
 * @date 2020/6/4 18:03
 */
public enum EnumSingleton {
    /**
     * 定义一个枚举的元素，代表Singleton的一个实例
     */
    INSTANCE;

    /**
     * 单例可以有自己的操作
     */
    public void singletonOperation() {
        // 功能处理
    }
}
