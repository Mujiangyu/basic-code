package com.niit.test;

import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class Test2 {
    public static void main(String[] args) {
        //找出某一范围内有多少个质数
        System.out.println("输入起始数字");
        Scanner sc = new Scanner(System.in);
        int from = sc.nextInt();
        System.out.println("输入结束数字");
        int end = sc.nextInt();

        int count = 0;
        for (int i = from; i <end ; i++) {
            boolean flag = true;
            for (int j = 2; j < i - 1 ; j++) {
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                count++;
            }
        }
        System.out.println(count);
    }
}
