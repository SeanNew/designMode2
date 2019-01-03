package com.produceConsumerPattern.java2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * Created by hadoop on 2019/1/3.
 * 公共资源类
 */
public class Resource {

    private int num = 0;//当前资源池中资源数量
    private int size = 10;//资源池中允许存放的资源数目

    private Lock lock;//使用lock为生产者消费者加锁
    private Condition producerCondition;
    private Condition consumerCondition;

    public Resource(Lock lock, Condition producerCondition, Condition consumerCondition) {
        this.lock = lock;
        this.producerCondition = producerCondition;
        this.consumerCondition = consumerCondition;
    }

    /*向资源池中添加资源*/
    public void add() {
        lock.lock();
        try {
            if (num < size) {
                num++;
                System.out.println(Thread.currentThread().getName() + "生产一件资源,当前资源池有" + num + "个");
                //唤醒等待的线程
                consumerCondition.signalAll();
            } else {
                //资源池满，生产者等待
                try {
                    producerCondition.await();
                    System.out.println(Thread.currentThread().getName() + "线程进入等待");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } finally {
            lock.unlock();
        }

    }
    /*从资源池取走资源*/
    public void remove(){
        lock.lock();
        try{
            if(num > 0){
                num -- ;
                System.out.println("消费者" + Thread.currentThread().getName()+ "消耗一件资源," + "当前资源池有" + num + "个");
                //唤醒等待的生产者线程
                producerCondition.signalAll();
            }else {
                //资源池中无数据、消费者等待
                try {
                    consumerCondition.await();
                    System.out.println(Thread.currentThread().getName() + "线程进入等待");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }finally {
            lock.unlock();
        }
    }
}
