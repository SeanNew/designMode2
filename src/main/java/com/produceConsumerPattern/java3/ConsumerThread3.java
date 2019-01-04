package com.produceConsumerPattern.java3;

/**
 * Created by hadoop on 2019/1/4.
 */
public class ConsumerThread3 extends Thread{

    private Resource3 resource3;

    public ConsumerThread3(Resource3 resource3) {
        this.resource3 = resource3;
    }

    public void run(){
        while (true){
            try {
                Thread.sleep(1000l);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            resource3.remove();
        }
    }
}
