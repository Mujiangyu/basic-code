package com.niit.test;

import java.util.Random;
import java.util.zip.CheckedOutputStream;

public class Test7 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int[] arr = new int[10];
        Random r = new Random();
        //生成是个随机数，并将其放入数组arr[]中
        for (int i = 0; i < 10; i++) {
            arr[i] = (r.nextInt(100) + 1);//生成1~100 的随机数并将其动态的放入到数组中
            System.out.print(arr[i]+" ");
        }
        //计算生成随机数的综合
        for (int i = 0; i < arr.length; i++) {
            sum = sum +arr[i];
        }
        System.out.println("\n生成的随机数的和为：" + sum);

        //计算随机数的平均数
        int avg = sum / arr.length;
        System.out.println("平均数为:" + avg);

        //通过循环找出小于平均数的随机数
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < avg){
                count++;
            }
        }
        System.out.println("小于平均数的随机生成数有:" + count + "个");
    }
}
