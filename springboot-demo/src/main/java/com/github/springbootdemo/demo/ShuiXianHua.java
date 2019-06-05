package com.github.springbootdemo.demo;

public class ShuiXianHua {

    /**
     * 水仙花数
     * @param args
     */
    public static void main(String[] args) {
       int a,b,c;
       for(int i=100;i<999;i++){
           a = i%10;
           b = i/10%10;
           c = i/100;
           if(a*a*a+b*b*b+c*c*c==i){
               System.out.println(i);
           }
       }
    }



}
