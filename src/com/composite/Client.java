package com.composite;

/**
 * @author 周
 * @title Client
 * @date 2020/6/8 20:52
 * @description 测试模拟杀毒软件架构
 */
public class Client {
    public static void main(String[] args) {
        AbstractFile f2, f3, f4, f5;
        Folder f1 = new Folder("收藏夹");
        f2 = new ImageFile("头像.jpg");
        f3 = new TextFile("Hello.txt");

        f1.add(f2);
        f1.add(f3);

        Folder f6 = new Folder("电影");

        f4 = new VideoFile("星际迷航");
        f5 = new VideoFile("阿凡达");

        f6.add(f4);
        f6.add(f5);

        f1.add(f6);

        // f2.killVirus();

        f1.killVirus();
    }
}
