package com.niit.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //求质数
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个整数");
        int num = sc.nextInt();
//        for (int i = 2; i < num; i++) {
//            if(num % i ==0){
//                System.out.println(num + " 是一个合数");
//                break;
//            }else if(num % i != 0 && i == (num - 1)){
//                System.out.println(num +" 是一个素数");
//            }
//        }
        boolean flag = true;
        for (int i = 2; i < num; i++) {
            if(num % i == 0){
                flag  = false;
                break;
            }
        }
        if(flag){
            System.out.println("是一个素数");
        }else{
            System.out.println("不是一个素数");
        }

    }
}
