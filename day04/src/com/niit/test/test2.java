package com.niit.test;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        System.out.println("请输入今天星期几");
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();
        switch (week){

            case 1:
                System.out.println("学java");
                break;
            case 2:
                System.out.println("学python");
                break;
            case 3:
                System.out.println("学c");
                break;
            case 4:
                System.out.println("学C++");
                break;
            case 5:
                System.out.println("学数据");
                break;
            case  6:
                System.out.println("学hadoop");
                break;
            case  7:
                System.out.println("学liunx");
                break;
            default:
                System.out.println("摆烂");
                break;
        }
    }
}
