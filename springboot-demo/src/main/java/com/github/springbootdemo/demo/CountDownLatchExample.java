package com.github.springbootdemo.demo;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchExample {

    //请求的数量
    private static final int threatCount = 550;

    public static void main(String[] args) throws Exception {

        //创建一个具有固定线程数量的线程池对象(如果这里线程池的线程数量给的太少的话，你会发现执行的很慢)
        ExecutorService threadPool = Executors.newFixedThreadPool(500);
        final CountDownLatch countDownLatch = new CountDownLatch(threatCount);
        for(int i=0;i<threatCount;i++){
            final int threadNum = i;
            threadPool.execute(()->{ //Lambda 表达式的运用
                try {
                    test(threadNum);
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    countDownLatch.countDown(); //表示一个请求已经被完成
                }
            });
        }
        countDownLatch.await();
        //关闭线程池
        threadPool.shutdown();
        System.out.println("finish");
    }

    public static void test(int threadnum) throws Exception{
        Thread.sleep(1000); //模拟请求的耗时时间
        System.out.println("threadnum:" + threadnum);
        Thread.sleep(1000); //模拟请求的耗时时间
    }

}
