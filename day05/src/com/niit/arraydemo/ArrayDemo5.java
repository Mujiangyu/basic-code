package com.niit.arraydemo;

import java.util.zip.CheckedOutputStream;

public class ArrayDemo5 {
    public static void main(String[] args) {
        //求数组的最值
        int[] arr = {33, 5, 22, 64, 55};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
//            if(max > arr[i]){
//                continue;
//            }
//            else {
//                max = arr[i];
//            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("数组中的最大值为：" + max);
    }
}
