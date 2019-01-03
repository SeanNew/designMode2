package com.produceConsumerPattern.java1;

/**
 * Created by hadoop on 2019/1/3.
 */
public class ConsumerThread extends Thread{
    private Resource resource;

    public ConsumerThread(Resource resource) {
        this.resource = resource;
    }
    public void run(){
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            resource.remove();
        }
    }
}
