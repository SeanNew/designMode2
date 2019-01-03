package com.produceConsumerPattern.java1;

/**
 * Created by hadoop on 2019/1/3.
 */
public class ProducerThread extends Thread{
    private Resource resource;

    public ProducerThread(Resource resource) {
        this.resource = resource;
    }
     public void run(){
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            resource.add();
        }
     }
}
