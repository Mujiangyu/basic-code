package com.niit.test;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入原码的位数");
        int n = sc.nextInt();
        int[] yuanma = getYuanma(n);

        int [] mima = mima(yuanma);
    }
    public static int[] getYuanma(int m){
        Scanner sc = new Scanner(System.in);
        int[] yuanma = new int[m];
        System.out.println("输入原码");
        for (int i = 0; i < yuanma.length; i++) {
            yuanma[i] = sc.nextInt();
        }
        return yuanma;
    }
    
    public static int[] mima(int[] a){
        for (int i = 0; i < a.length; i++) {
            //加密规则
            a[i] = a[i] + 5;
            a[i] = a[i] % 10;
        }
        for (int i = 0,j = a.length - 1; i < j; i++,j--) {
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        return a;
    }
}
