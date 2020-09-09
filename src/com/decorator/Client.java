package com.decorator;

/**
 * @author 周
 * @title Client
 * @date 2020/6/8 21:34
 * @description
 */
public class Client {
    public static void main(String[] args) {
        Car car=new Car();
        car.move();

        System.out.println("增加新的功能---飞行");
        FlyCar flyCar=new FlyCar(car);
        flyCar.move();

        System.out.println("增加新的功能---水上滑行");
        WaterCar waterCar=new WaterCar(car);
        waterCar.move();

        System.out.println("增加两个新的功能");
        WaterCar waterCar2=new WaterCar(new FlyCar(car));
        waterCar2.move();
    }
}
