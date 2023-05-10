package com.niit.test;

public class Test7 {
    public static void main(String[] args) {
        double hight = 0.1;
        int count = 0;
        while(hight < 8844430){
            hight *= 2;
            count++;
        }
        System.out.println("折叠" + count + "次后，可以达到珠穆朗玛峰的高度");
    }
}
