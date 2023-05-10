package com.niit.test;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.REUtil;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {

        System.out.println("输入评委的个数：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] score = getScore(num);

        int max = getMaxScore(score);

        int min = getMinScore(score);

        int sum = getSum(score,max,min,num);

        System.out.println("平均分是：" + sum);
    }
    public static int[] getScore(int num){
        Scanner sc = new Scanner(System.in);
        int[] score = new int[num];
        System.out.println("输入各评委所打的分数");
        for (int i = 0; i < score.length; ) {
            int a = sc.nextInt();
            //限定键盘录入的值必须在某个范围之内
            if(a < 0 || a > 100){
                System.out.println("分数不合法");
            }else{
                score[i] = a;
                i++;
            }
        }
        return score;
    }
    public static int getMaxScore(int[] score){
        int max = score[0];
        for (int i = 1; i < score.length; i++) {
            if (max < score[i]) {
                max = score[i];
            }
        }
        return max;
    }
    public static int getMinScore(int[] score){
        int min = score[0];

        for (int i = 1; i < score.length; i++) {
            if (min > score[i]) {
                min = score[i];
            }
        }
        return min;
    }

    public static int getSum(int[]score,int max, int min, int num){
        int count = 0;
        for (int i = 0; i < score.length; i++) {
            count = count + score[i];
        }
        int sum = (count -max -min)/(num - 2);
        return sum;
    }
}