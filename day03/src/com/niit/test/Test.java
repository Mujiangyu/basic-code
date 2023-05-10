package com.niit.test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //输入一个数字，获取其各位上的数字

        //1,键盘录入数字
        System.out.println("请输入一个三位数");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        //2,获取数字
        //公式：
        //个位： % 10
        //十位： / 10 % 10
        //百位： / 100 % 10
        //...
        System.out.println("个位上的数字为：" + i % 10);
        System.out.println("十位上的数字为：" + i /10 % 10);
        System.out.println("百位上的数字为：" + i /100 % 10);

        int a = 200;
        byte b = (byte) a;
        System.out.println(b);
    }
}
