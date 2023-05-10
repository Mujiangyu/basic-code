package com.niit.arraydemo;
//动态初始化
public class ArrayDemo4 {
    public static void main(String[] args) {
        //动态初始化
        //格式  数据类型[] 数组名 = new 数据类型[数组的长度]
        String[] arr = new String[50];
        //添加数据
        arr[0] = "norman";
        arr[1] = "meimei";
        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }
        //数组默认初始化值的规律
        //整数类型，默认初始化值为0
        //小数类型，默认初始化值为0.0
        //字符类型，默认初始化值为'\u0000'(空格)
        //引用类型，默认初始化值为null
        //布尔类型，默认初始化值为false

        int[] arr1 = new int[10];
        arr1[0] = 1;
        arr1[1] = 2;
        for (int i = 0; i < 3; i++) {
            System.out.println(arr1[i]);
        }

    }
}
