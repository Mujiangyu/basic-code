package com.niit.test;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.REUtil;

import java.util.Random;

public class Test8 {
    public static void main(String[] args) {
        int[] money = {2, 588, 888, 1000, 10000};
        int[] arr = new int[money.length];
        Random r = new Random();

        for (int i = 0; i < money.length; ) {
            int price = money[r.nextInt(money.length)];
            boolean flag = contains(arr,price);
            if(!flag) {
                arr[i] = price;
                i++;   //只用当奖项没有被抽出时，循环控制条件才会发生变化
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("奖项 " + arr[i] + " 已被抽出");
        }

    }
    //定义一个函数用来判断奖项是否已经被抽出来
    public static boolean contains(int[] a, int price){
        for (int i = 0; i < a.length; i++) {
            if(price == a[i]){
                return true;
            }
        }
        return false;
    }
}

