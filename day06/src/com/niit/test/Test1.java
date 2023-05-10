package com.niit.test;

public class Test1 {
    public static void main(String[] args) {
        //根据需求不同，决定是使用无参方法还是带参方法
        getLength(12.43,23.4);
        getArea(3);
    }
    //求长方形的周长
    public static void getLength(double len, double width){
        double result = (len + width) * 2;
        System.out.println(result);
    }

    //求圆的面积
    public static void getArea(double r){
        double area = 3.14 * r * r;
        System.out.println(area);
    }
}
