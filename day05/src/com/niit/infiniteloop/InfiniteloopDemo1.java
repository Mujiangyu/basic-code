package com.niit.infiniteloop;

public class InfiniteloopDemo1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if(i == 3)
                //结束本次循环，直接开始下次循环
                continue;
                //break; 结束整个循环，直接推出
            System.out.println(i);
        }
    }
}
