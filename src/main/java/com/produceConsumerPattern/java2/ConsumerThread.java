package com.produceConsumerPattern.java2;

/**
 * Created by hadoop on 2019/1/3.
 */
public class ConsumerThread extends Thread{

    private Resource resource;

    public ConsumerThread(Resource resource) {
        this.resource = resource;
        setName("消费者==");
    }
    public void run(){
        while (true){
            try {
                Thread.sleep((long)(1000*Math.random()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            resource.remove();
        }
    }
}
