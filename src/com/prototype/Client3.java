package com.prototype;

import java.io.*;
import java.util.Calendar;
import java.util.Date;

/**
 * @author 周
 * @title Client3
 * @description 测试原型模式
 * 序列化和反序列化实现深克隆
 * @date 2020/6/6 18:48
 */
public class Client3 {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Date date = new Date(96, Calendar.JULY, 5);
        Sheep s1 = new Sheep("Dolly", date);
        // Sheep s2 = (Sheep) s1.clone();         // 实现深复制，s2对象的birthday是一个新对象
        // 使用序列化和反序列化实现深度复制
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(s1);
        oos.close();
        bos.close();

        byte[] bytes = bos.toByteArray();

        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);

        Sheep s2 = (Sheep) ois.readObject();

        ois.close();
        bis.close();


        System.out.println(s1);
        System.out.println(s1.getSname());
        System.out.println(s1.getBirthday());
        date.setHours(12);
        System.out.println(s1.getBirthday());


        System.out.println(s2);
        System.out.println(s2.getSname());
        System.out.println(s2.getBirthday());
    }
}
