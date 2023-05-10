package com.niit.methoddemo;


public class MethodDemo5 {
    //方法的重载
    public static void main(String[] args) {
        //在同一个类中，定义了多个同名方法，这些方法具有同种的功能
        //每个方法具有不同的参数类型和参数个数，这些同名的方法，构成了重载关系
        //同一个类中，方法名相同，参数不同的方法。与返回值无关
        //参数不同：个数不同，类型不同，顺序不同

        //调用 返回值为int的方法
        compare(10,20);
        //调用返回值为byte的方法
        compare((byte) 10, (byte) 20);
        //调用返回值为short的方法
        compare((short) 10,(short) 20);
        //调用返回值为long的方法
        compare((long) 10, (long) 20);
    }

    //把相同功能的方法名，写成一样的
    //调用方法是会十分方便
    public static void compare(byte b1, byte b2){
        System.out.println("byte");
        System.out.println(b1 == b2);
    }

    public static void compare(short s1, short s2){
        System.out.println("short");
        System.out.println(s1 == s2);
    }


    public static void compare(int i1, int i2){
        System.out.println("int");
        System.out.println(i1 == i2);
    }


    public static void compare(long l1, long l2){
        System.out.println("long");
        System.out.println(l1 == l2);
    }


}
