package com.github.springbootdemo.demo;

import java.util.concurrent.FutureTask;

public class Test2 {

    public static void main(String[] args) {

//      FutureTask<String>
        Hello h1 = new HelloService();
        System.out.println(h1.a);
        h1.say();
        Hello h2 = new Hello();
        System.out.println(h2.a);
        h2.say();
        HelloService h3 = new HelloService();
        System.out.println(h3.a);
        h3.say();

    }

}
