package com.decorator;

/**
 * @author 周
 * @title ICar
 * @date 2020/6/8 21:27
 * @description 装饰器模式
 */
public interface ICar {
    void move();
}

/**
 * 具体构件角色
 */
class Car implements ICar {

    @Override
    public void move() {
        System.out.println("陆地上跑");
    }
}

/**
 * Decorator装饰角色
 */
class SuperCar implements ICar {

    private ICar car;

    public SuperCar(ICar car) {
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }
}

/**
 * ConcreteDecorator具体构件对象
 */
class FlyCar extends SuperCar {

    public FlyCar(ICar car) {
        super(car);
    }

    public void fly() {
        System.out.println("空中飞行");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }
}/**
 * ConcreteDecorator具体构件对象
 */
class WaterCar extends SuperCar {

    public WaterCar(ICar car) {
        super(car);
    }

    public void swim() {
        System.out.println("水上滑行");
    }

    @Override
    public void move() {
        super.move();
        swim();
    }
}/**
 * ConcreteDecorator具体构件对象
 */
class AICar extends SuperCar {

    public AICar(ICar car) {
        super(car);
    }

    public void fly() {
        System.out.println("自动驾驶");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }
}
