package com.github.springbootdemo.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @Description: 需要一次性拿一个许可的情况
 */
public class SemaphoreExample {

    //请求的数量
    private static final int threatCount = 550;

    public static void main(String[] args) {

        //创建一个具有固定线程数量的线程池对象(如果这里线程池的线程数量给的太少的话，你会发现执行的很慢)
        ExecutorService threadPool = Executors.newFixedThreadPool(500);
        //一次只能允许执行的线程数量
        final Semaphore semaphore = new Semaphore(20);

        for(int i=0;i<threatCount;i++){
            final int threadNum = i;
            threadPool.execute(()->{ //Lambda 表达式的运用
                try {
                    semaphore.acquire(); // 获取一个许可，所以可运行线程数量为20/1=20
                    test(threadNum);
                    semaphore.release(); //释放一个许可
                }catch (Exception e){
                    e.printStackTrace();
                }
            });
        }
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
