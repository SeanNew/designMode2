package com.produceConsumerPattern.java2;

/**
 * Created by hadoop on 2019/1/3.
 */
public class ProducerThread extends Thread{

    private Resource resource;

    public ProducerThread(Resource resource) {
        this.resource = resource;
        setName("生产者--");
    }

    public void run(){
        while (true){
            try {
                Thread.sleep((long)(1000*Math.random()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            resource.add();
        }
    }
}
