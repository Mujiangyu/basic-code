package com.niit.methoddemo;

import javax.sound.midi.VoiceStatus;
import java.util.Scanner;

public class MethodDemo3 {
    public static void main(String[] args) {
        count();
        count1(192,382);
    }

    public static void count(){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个数字");
        int a = sc.nextInt();
        System.out.println("输入第二个数字");
        int b = sc.nextInt();
        System.out.println("两个数字的和是："+(a + b));
    }
    public static void count1(int num1,int num2){
        int result = num1 + num2;
        System.out.println(result);
    }
}
