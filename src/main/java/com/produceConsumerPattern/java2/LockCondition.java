package com.produceConsumerPattern.java2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by hadoop on 2019/1/3.
 */
public class LockCondition {
    public static void main(String[] args){
        Lock lock = new ReentrantLock();
        Condition producerCondition = lock.newCondition();
        Condition consumerCondition = lock.newCondition();

        Resource resource = new Resource(lock,producerCondition,consumerCondition);

        //生产者线程
        ProducerThread pt1 = new ProducerThread(resource);

        //消费者线程
        ConsumerThread ct1 = new ConsumerThread(resource);
        ConsumerThread ct2 = new ConsumerThread(resource);
        ConsumerThread ct3 = new ConsumerThread(resource);

        pt1.start();
        ct1.start();
        ct2.start();
        ct3.start();
    }
}
