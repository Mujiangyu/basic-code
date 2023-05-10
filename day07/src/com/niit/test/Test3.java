package com.niit.test;

import java.lang.annotation.ElementType;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        char[] chr = new char[52];
        for (int i = 0; i < chr.length; i++) {
            if (i < 25) {
                chr[i] = (char) (97 + i);
            } else {
                chr[i] = (char) (65 + i - 26);
            }
        }
        Random r = new Random();
        char[] index = new char[4];
        String str = "";
        for (int i = 0; i < 4; i++) {
            index[i] = chr[r.nextInt(chr.length)];
            str = str + index[i];
        }
        int num = r.nextInt(10);
        System.out.println(str + num);

    }
}
