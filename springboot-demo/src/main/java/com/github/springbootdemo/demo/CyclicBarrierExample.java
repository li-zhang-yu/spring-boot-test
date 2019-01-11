package com.github.springbootdemo.demo;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CyclicBarrierExample {

    //请求的数量
    private static final int threatCount = 550;

    //需要同步的线程数量
    private static final CyclicBarrier cyclicBarrier = new CyclicBarrier(5);

    public static void main(String[] args) throws Exception {

        //创建固定数量的线程池
        ExecutorService threadPool = Executors.newFixedThreadPool(10);

        for(int i=0;i<threatCount;i++){
            final int threadNum = i;
            Thread.sleep(1000);
            threadPool.execute(()->{
                try {
                    test(threadNum);
                }catch (Exception e){
                    e.printStackTrace();
                }
            });
        }
        //关闭线程
        threadPool.shutdown();
    }

    public static void test(int threadNum) throws Exception{
        System.out.println("threadNum:" + threadNum + "is ready");
        try {
            cyclicBarrier.await(5000, TimeUnit.MILLISECONDS); //时间不能设置的太小，不然会报错
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("threadNum:" + threadNum + "is finish");
    }

}
