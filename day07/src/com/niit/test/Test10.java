package com.niit.test;

import java.lang.annotation.ElementType;
import java.util.Random;
import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        //代码实现双色球彩票系统

        //生成随机的双色球号码
        int number[] = getNumber();
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();
        System.out.println("===============================");

        //用户输入自己购买的双色球号码
        int[] userInput = getUserInputNumber();

        //用户购买双色球与本期中将双色球号码进行对比，判断所中奖项
        //取出用户所买的每一个双色球与中将号码序列进行对比
        int sum = num(userInput,number);

    }

    //生成随机的双色球号码
    public static int[] getNumber() {
        int[] arr = new int[7];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int redNumber = r.nextInt(33) + 1;
            arr[i] = redNumber;
        }
        int blueNumber = r.nextInt(16) + 1;
        return arr;
    }


    //用户输入自己购买的双色球号码
    public static int[] getUserInputNumber() {
        int[] userInputNumber = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < userInputNumber.length - 1; ) {
            System.out.println("输入红球号码");
            int uesrReadNumber = sc.nextInt();
            if (uesrReadNumber >= 1 && uesrReadNumber <= 33) {
                userInputNumber[i] = uesrReadNumber;
                i++;
            } else {
                System.out.println("输入的号码不合法，请重新输入");
            }
        }
        System.out.println("输入蓝球号码");
        boolean flag = true;
        while (flag) {
            int userBuleNumber = sc.nextInt();
            if (userBuleNumber >= 1 && userBuleNumber <= 16) {
                userInputNumber[6] = userBuleNumber;
                flag = false;
            } else {
                System.out.println("请重新输入");
            }
        }
        return userInputNumber;
    }

    //用户购买双色球与本期中将双色球号码进行对比，判断所中奖项
    //取出用户所买的每一个双色球与中将号码序列进行对比
    public static int num(int[] userInput, int[] number) {
        int count = 0;
        //判断红球中将的个数
        for (int i = 0; i < userInput.length - 1; i++) {
            for (int j = 0; j < number.length - 1; j++) {
                if (userInput[i] == number[j]) {
                    count++;
                    break;
                }
            }
        }
        System.out.println("红球中将个数为：" + count);
        if (userInput[userInput.length - 1] == number[number.length - 1]) {
            System.out.println("蓝球中将个数为：" + 1);
        } else {
            System.out.println("蓝球没有中");
        }
        return count;
    }
}
