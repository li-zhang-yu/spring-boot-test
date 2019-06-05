package com.github.springbootdemo.demo;

import java.util.HashMap;
import java.util.Random;

public class Man {

    public static void main(String[] args) {
        Man m = new Man();
        int a = m.sum(3,5);
        m.getUsername();
        m.getSum();
        System.out.println(a);
    }

    /**
     * 求两者中的最大值
     * @param x
     * @param y
     * @return
     */
    public int sum(int x,int y){
        if(x>y){
            return x;
        }else {
            return y;
        }
    }

    public void getUsername(){
        Random r = new Random(10);
        System.out.println(r.toString());
    }

    /**
     * 求1到10的和
     */
    public void getSum(){
        int i = 3;
        int sum = 0;
        for(int j = 1;j<=10;j++){
            sum += j;
        }
        System.out.println(sum);
    }

}
