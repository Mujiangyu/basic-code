package com.niit.ifdemo;

import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wine = sc.nextInt();
        if(wine > 2){
            System.out.println("酒量不错");
        }
    }
}
