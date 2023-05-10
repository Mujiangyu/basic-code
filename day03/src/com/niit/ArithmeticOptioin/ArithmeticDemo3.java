package com.niit.ArithmeticOptioin;

import java.lang.reflect.Type;

public class ArithmeticDemo3 {
    public static void main(String[] args) {
        byte a = 100;
        byte b = 100;
        //正常的写法
        int result = a + b;
        //强制类型转换
        byte count = (byte) (a + b);
        System.out.println(count); //结果发生错误，byte类型存储的数据范围只有-128~128
        System.out.println(result);

    }
}
