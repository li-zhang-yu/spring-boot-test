package com.github.springbootdemo;

import com.github.springbootdemo.demo.Man;
import com.github.springbootdemo.demo.MyConfig;
import com.github.springbootdemo.demo.Woman;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

@SpringBootApplication
/**
 * 把用到的资源导入到当前容器中
 */
@Import({MyConfig.class})
@Component
public class SpringbootDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootDemoApplication.class,args);
        System.out.println(context.getBean(Man.class));
        System.out.println(context.getBean(Woman.class));
        context.close();
    }


    public void say(){
//        CountDownLatch c = new CountDownLatch(3);

        Semaphore s = new Semaphore(4);
        System.out.println("你好啊");
    }

}

