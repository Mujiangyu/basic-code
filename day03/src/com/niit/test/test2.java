package com.niit.test;

public class test2 {
    public static void main(String[] args) {
        int a = 200;
        int b = 10;
        //逻辑或
        System.out.println(a | b);
        //逻辑与
        System.out.println(a & b);
        //向左移动，低位补0
        System.out.println(a << 2);
        //向右以后，高位补0或1（正数补0，负数补1）
        System.out.println(a >> 2);
        //无符号右移，向右移动，高位补0
        System.out.println(a >>> 2);
    }
}
