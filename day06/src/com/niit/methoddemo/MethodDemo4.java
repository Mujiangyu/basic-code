package com.niit.methoddemo;

//带返回值的方法的定义和调用格式
public class MethodDemo4 {
    public static void main(String[] args) {
        //直接调用,一般   适用于无参函数
        getSum(43, 45);
        //赋值调用
        int x = getSum(43, 45);
        System.out.println(x);
        //输出调用
        System.out.println(getSum(43,45));
    }

    public static int getSum(int a, int b) {
        int c = a + b;
        return c;//返回给方法的调用处 哪里调用方法，就把值返回给哪里
    }
}
