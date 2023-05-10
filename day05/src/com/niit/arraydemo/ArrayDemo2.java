package com.niit.arraydemo;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //获取数组中的元素
        int[] arr = {1,2,3,4,5};
        int num = arr[0];
        System.out.println(num);
        System.out.println(arr[1]);

        //把数据存储到数组中,一旦存储进去，原来的数据就会被覆盖
        //数组名[索引] = 具体数据/变量
        arr[0] = 100;
        System.out.println(arr[0]);
    }
}
