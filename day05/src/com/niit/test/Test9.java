package com.niit.test;

import java.util.Random;

//随机打乱数组
public class Test9 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            int a = r.nextInt(arr.length);
            int tem = arr[i];
            arr[i] = arr[a];
            arr[a] = tem;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
