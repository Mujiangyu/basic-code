package com.niit.arraydemo;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4};   //完整
        int[] array2 = {5,6,7,8};           //简写            //[I@1b6d3586

        String[] str = {"norman","meimei","qs"};                 //[Ljava.lang.String;@1b6d3586
        String[] str1 = new String[]{"norman","meimei","qs"};    //[Ljava.lang.String;@1b6d3586

        double[] height = {1.93,1.73,1.82};             //[D@1b6d3586
        double[] height1 = new double[]{1.93,1.73,1.82};//[D@1b6d3586

//        System.out.println(height1);
//        System.out.println(str1);
        System.out.println(array);


        //解释地址的含义
        //[: 表示当前是一个数组
        //D: 表示数组中的类型是double(I 表示数组中是int类型)
        //1b6d3586: 数组在内存中的真正地址（十六进制）
        //通常我们将他们组合起来的值叫做数组的地址
    }
}
