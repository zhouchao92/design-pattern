package com.iterator;

/**
 * @author 周
 * @title MyIterator
 * @date 2020/6/12 18:48
 * @description 自定义迭代接口
 */
public interface MyIterator {
    void first();

    void next();

    boolean hasNext();

    boolean isFirst();

    boolean isLast();

    Object getCurrentObj(); // 获取当前游标的对象
}
