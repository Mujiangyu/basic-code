package com.niit.ArithmeticOptioin;

import javax.xml.transform.Source;

public class ArithmeticDemo5 {
    public static void main(String[] args) {
        int a = 5;
        a++;
        System.out.println(a);
        int b = 5;
        ++b;
        System.out.println(b);

        int c = 5;
        int f = 5;
        //先用后加
        int d = c++;
        System.out.println(d);//5
        //先加后用
        int e = ++f;
        System.out.println(e);//6
    }
}
