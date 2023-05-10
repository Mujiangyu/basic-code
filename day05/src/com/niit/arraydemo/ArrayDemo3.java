package com.niit.arraydemo;
//遍历数组

public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {      //数组名.length 获取数组的长度
            System.out.println(arr[i]);
        }
        //数组快速遍历 数组名.fori——>arr.fori
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += arr[i];
        }
        System.out.println(count);
    }
}
