package com.niit.test;

import java.util.Scanner;
//复制数组到一个新的数组中
public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入数组的元素个数");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] res = new int[arr.length];
        System.out.println("输入数组元素");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < res.length; i++) {
            res[i] = arr[i];
        }
        System.out.println("数组res的元素为：");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
