package com.singleton;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * @author 周
 * @title TestHungrySingleton
 * @description
 * @date 2020/6/4 18:47
 */
public class TestHungrySingleton {
    public static void main(String[] args) throws Exception {

        HungrySingletonSerializable s1=HungrySingletonSerializable.getInstance();
        HungrySingletonSerializable s2=HungrySingletonSerializable.getInstance();
        System.out.println(s1);
        System.out.println(s2);

        // 通过反射破解单例模式，直接调用私有化构造器
        // Class<HungrySingletonSerializable> clazz = (Class<HungrySingletonSerializable>) Class.forName("com.singleton.HungrySingleton");
        // Constructor<HungrySingletonSerializable> c = clazz.getDeclaredConstructor(null);
        // c.setAccessible(true);  // 跳过权限检查
        // HungrySingletonSerializable s3 = c.newInstance();
        // HungrySingletonSerializable s4 = c.newInstance();


        // 通过反序列化的方式构造多个对象
        FileOutputStream fos=new FileOutputStream("a.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(s1);
        oos.close();
        fos.close();

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("a.txt"));
        HungrySingletonSerializable s5= (HungrySingletonSerializable) ois.readObject();

        System.out.println(s5);

    }
}
