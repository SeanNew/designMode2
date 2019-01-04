package com.produceConsumerPattern.java3;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by hadoop on 2019/1/4.
 * 资源池
 */
public class Resource3 {

    private BlockingQueue resourceQueue = new LinkedBlockingQueue(10);

    /*向资源池添加资源*/
    public void add(){
        try {
            resourceQueue.put(1);
            System.out.println("生产者" + Thread.currentThread().getName() + "生产一件资源," + "当前资源池有" + resourceQueue.size() +"个资源");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /*移除资源池中的资源*/
    public void remove(){
        try {
            resourceQueue.take();
            System.out.println("消费者" + Thread.currentThread().getName() +"消耗一件资源," + "当前资源池有" + resourceQueue.size()+ "个资源");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
