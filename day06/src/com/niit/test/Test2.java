package com.niit.test;


import java.lang.reflect.Array;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //遍历数组
//        bianli();

        //求数组中的最大值
//        int a = max();
//        System.out.println("数组中的最大值为：" + a);

        //判断数组中是否存在某个值
//        boolean bl = if_existence(34);
//        System.out.println(bl);

        //复制数组
        int[] a = copyOfRange(2, 4);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    //以指定格式遍历数组
//    public static void bianli(){
//        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[5];
//        System.out.println("输入数组");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.print("[");
//        for (int i = 0; i < arr.length; i++) {
//            if(i == arr.length-1)
//                System.out.print(arr[i]);
//            else
//                System.out.print(arr[i] + ",");
//        }
//        System.out.println("]");
//    }

    //求数组的最大值
//    public static int max() {
//        int[] arr = new int[5];
//        Scanner sc = new Scanner(System.in);
//        int max = arr[0];
//        System.out.println("请输入数组元素");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        for (int i = 1; i < arr.length; i++) {
//            if (max < arr[i])
//                max = arr[i];
//        }return max;
//    }

    //判断数组中是否有某个值
//    public static boolean if_existence(int x) {
//        int[] arr = new int[5];
//        Scanner sc = new Scanner(System.in);
//        int max = arr[0];
//        System.out.println("请输入数组元素");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == x) {
//                return true;
//            }
//        }
//        return false;
//    }

    //复制数组
    public static int[] copyOfRange(int from, int to) {
        int[] arr = new int[10];
        int m = to - from;
        int[] b = new int[m];
        System.out.println("输入数组");
        for (int i = 0; i < arr.length; i++) {
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();
        }
        //伪造索引变量
        int n = 0;
        for (int i = from; i < to; i++) {
            b[n] = arr[i];
            n++;
        }
        return b;
    }
}