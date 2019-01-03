package com.produceConsumerPattern.java1;

/**
 * Created by hadoop on 2019/1/3.
 * 方式一：通过synchronized 、wait 、 notify 实现
 */
public class ProducerConsumerWithWaitNofity {
    public static void main(String[] args){
        System.out.println("通过synchronized 、wait 、 notify 实现");
        Resource resource = new Resource();
        //生产者线程
        ProducerThread pt1 = new ProducerThread(resource);
        ProducerThread pt2 = new ProducerThread(resource);
        ProducerThread pt3 = new ProducerThread(resource);
        //消费者线程
        ConsumerThread ct1 = new ConsumerThread(resource);
        ConsumerThread ct2 = new ConsumerThread(resource);
        ConsumerThread ct3 = new ConsumerThread(resource);

        pt1.start();
        pt2.start();
        pt3.start();

        ct1.start();
        ct2.start();
        ct3.start();

    }

}
