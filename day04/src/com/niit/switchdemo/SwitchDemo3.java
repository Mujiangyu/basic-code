package com.niit.switchdemo;

public class SwitchDemo3 {
    public static void main(String[] args) {
        int num = 1;
        switch (num){
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            case 3:
                System.out.println("3");
        }

        //jdk12之后的新特性
//        int a = 1;
//        switch (a){
//            case 1 -> System.out.println("1");
//            case 2 -> System.out.println("2");
//            case 3 -> System.out.println("3");
//        }
    }
}
