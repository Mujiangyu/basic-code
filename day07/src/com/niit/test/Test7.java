package com.niit.test;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入密码的位数");
        int n = sc.nextInt();
        int[] Mima = getMima(n);

        int [] mima = jiema(Mima);
    }
    public static int[] getMima(int m){
        Scanner sc = new Scanner(System.in);
        int[] mima = new int[m];
        System.out.println("输入密码");
        for (int i = 0; i < mima.length; i++) {
            mima[i] = sc.nextInt();
        }
        return mima;
    }

    public static int[] jiema(int[] a){
        for (int i = 0,j = a.length - 1; i < j; i++,j--) {
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
        }
        for (int i = 0; i < a.length; i++) {
            //加密规则
            if(a[i] >= 0 && a[i] <= 4){
                a[i] = a[i] + 10;
            }
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] - 5;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        return a;
    }
}
