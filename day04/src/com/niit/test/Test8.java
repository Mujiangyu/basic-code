package com.niit.test;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        System.out.println("输入一个数字");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int temp = x;
        int num = 0;
        while(x != 0){
            int ge = x % 10;
            x = x / 10;
            num = num * 10 + ge;
        }
        System.out.println("该数字是否是一个回文数:" + (num == temp));
    }
}
