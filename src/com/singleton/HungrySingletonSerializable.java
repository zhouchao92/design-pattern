package com.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @author 周
 * @title HungrySingleton
 * @description 饿汉式单例防止反射和反序列化漏洞
 * 线程安全，不需要Synchronized关键字
 * @date 2020/6/4 17:32
 */
public class HungrySingletonSerializable implements Serializable {
    // 加载类时，天然的是线程安全的
    private static HungrySingletonSerializable instance = new HungrySingletonSerializable();// 类初始化时，立即加载这个对象

    private HungrySingletonSerializable() {
        // 多次创建时，抛出异常，防止反射和反序列化漏洞
        if (instance != null) {
            throw new RuntimeException();
        }
    }

    // 方法没有同步，调用效率高
    public static HungrySingletonSerializable getInstance() {
        return instance;
    }

    /**
     * 反序列化时，如果定义了readResolve()方法则直接返回此方法指定对象，而不需要单独再创建新对象
     * @return
     * @throws ObjectStreamException
     */
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }
}
