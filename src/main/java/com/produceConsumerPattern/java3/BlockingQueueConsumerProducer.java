package com.produceConsumerPattern.java3;

/**
 * Created by hadoop on 2019/1/4.
 */
public class BlockingQueueConsumerProducer {
    //使用阻塞队列blockingqueue解决生产消费者问题
    public static void main(String[] args){
        Resource3 resource3 = new Resource3();
        ProducerThread3 pt1 = new ProducerThread3(resource3);

        ConsumerThread3 ct1 = new ConsumerThread3(resource3);
        ConsumerThread3 ct2 = new ConsumerThread3(resource3);
        ConsumerThread3 ct3 = new ConsumerThread3(resource3);

        pt1.start();
        ct1.start();
        ct2.start();
        ct3.start();
    }
}
