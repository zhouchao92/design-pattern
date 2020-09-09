package com.iterator;

/**
 * @author 周
 * @title Client
 * @date 2020/6/12 18:59
 * @description
 */
public class Client {
    public static void main(String[] args) {
        ConcreteMyAggregate cma = new ConcreteMyAggregate();
        cma.addObject("a");
        cma.addObject("b");
        cma.addObject("c");

        MyIterator iterator = cma.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.getCurrentObj());
            iterator.next();
        }
    }
}
