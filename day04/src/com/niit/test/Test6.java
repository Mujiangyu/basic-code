package com.niit.test;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        //键盘录入数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字");
        int b = sc.nextInt();
        //输出既能被3整除也能被5整除的数字
        int count = 0;
        for(int i = a; i <= b; i++){
            if(i % 3 == 0 && i % 5== 0){
                count++;
                System.out.println("符合条件的数字有" + count + "个,分别是");
                System.out.println(i);
            }
        }

    }
}
