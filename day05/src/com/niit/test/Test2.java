package com.niit.test;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("输入一个大于2的正整数:");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x = 0;
        while (x < num){
            if(x * x == num  ){
                System.out.println(num + "的平方根是:" + x);
                break;
            }else if(x * x >= (num -1)){
                System.out.println(num + "的平方根的整数部分是:" + (x - 1));
                break;
            }
            x++;
        }

//        for (int i = 1; i <= num; i++) {
//            if(i * i ==num){
//                System.out.println(num + "的平方根是" + i);
//                break;
//            }else if(i * i >num){
//                System.out.println((i - 1) + " 是num平方根的整数部分");
//                break;
//            }
//        }
    }
}
