package com.singleton;


import java.util.concurrent.CountDownLatch;

/**
 * @author 周
 * @title TestSpeed
 * @description 测试五种创建单例模式的效率
 * @date 2020/6/4 19:08
 */
public class TestSpeed {
    public static void main(String[] args) throws InterruptedException {

        long start = System.currentTimeMillis();

        final CountDownLatch countDownLatch = new CountDownLatch(10);

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                for (int i1 = 0; i1 < 100000; i1++) {
                    // Object o = HungrySingleton.getInstance();   // 78
                    // Object o = LazySingleton.getInstance(); // 130
                    // Object o = DoubleCheckLockSingleton.getInstance(); //87
                    // Object o = StaticSingleton.getInstance();   // 80
                    // Object o = EnumSingleton.INSTANCE;  // 72
                }
                countDownLatch.countDown();
            }).start();
        }

        countDownLatch.await(); // 等待，main线程阻塞

        long end = System.currentTimeMillis();
        System.out.println("总耗时：" + (end - start));
    }
}
