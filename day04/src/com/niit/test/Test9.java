package com.niit.test;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        System.out.println("请输入被除数");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("请输入出除数");
        Scanner sc1 = new Scanner(System.in);
        int b = sc1.nextInt();
        int result = 0;
        while(a > b){
            a = a - b;
            result++;
           }
        System.out.println("余数：" + a);
        System.out.println("商：" + result);
        }
    }
