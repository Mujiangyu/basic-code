package com.niit.test;

import java.util.Random;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Random rm = new Random();
        int i = rm.nextInt(100) + 1;//1~100的随机数
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("输入你要猜测的数字");
            int guessNumber = sc.nextInt();
            if(guessNumber > i){
                System.out.println("数字偏大");
            }else if(guessNumber < i){
                System.out.println("数字偏小");
            }else {
                System.out.println("猜中");
                break;
            }
        }
    }
}
