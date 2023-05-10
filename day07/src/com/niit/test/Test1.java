package com.niit.test;

import java.util.PrimitiveIterator;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价：");
        int price = sc.nextInt();
        System.out.println("请输入当前月份：");
        int month = sc.nextInt();
        System.out.println("请输入您选择的舱位：");
        int seat = sc.nextInt();

        if (month >= 5 && month <= 10) {
            //旺季
            price = getPrice(seat, price, 0.9, 0.85);
        } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            //淡季
            price = getPrice(seat, price, 0.7, 0.65);
        }
        System.out.println(price);
    }

    public static int getPrice(int seat, int price, double x, double x1) {
        if (seat == 0) {
            //头等舱
            price = (int) (price * x);

        } else if (seat == 1) {
            //经济舱
            price = (int) (price * x1);
        }
        return price;
    }
}
