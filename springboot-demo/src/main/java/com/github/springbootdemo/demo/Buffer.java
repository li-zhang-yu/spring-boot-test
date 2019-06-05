package com.github.springbootdemo.demo;

import java.nio.channels.Selector;
import java.util.HashMap;

public class Buffer {

    public static void main(String[] args) throws Exception {

        Selector selector = Selector.open();
        selector.isOpen();
        System.out.println(selector.isOpen());

        HashMap map = new HashMap();
        System.out.println(map.size());

        int a = 789;
        System.out.println(a%10);
        System.out.println(a/10%10);
        System.out.println(a/100);


    }


    public String getString(){
        return "123";
    }

}


