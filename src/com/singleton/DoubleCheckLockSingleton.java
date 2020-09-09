package com.singleton;

/**
 * @author 周
 * @title DoubleCheckLockSingleton
 * @description 双重检测锁式单例
 * @date 2020/6/4 17:49
 */
public class DoubleCheckLockSingleton {

    private static DoubleCheckLockSingleton sInstance = null;

    private DoubleCheckLockSingleton() {

    }

    public static DoubleCheckLockSingleton getInstance() {
        if (sInstance == null) {
            DoubleCheckLockSingleton sc;
            synchronized (DoubleCheckLockSingleton.class) {
                sc = sInstance;
                if (sc == null) {
                    synchronized (DoubleCheckLockSingleton.class) {
                        if (sc == null) {
                            sc = new DoubleCheckLockSingleton();
                        }
                    }
                    sInstance = sc;
                }
            }
        }
        return sInstance;
    }
}
