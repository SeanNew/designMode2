package com.observerPattern.java1;

/**
 * Created by hadoop on 2018/12/28.
 * 创建实体类观察者,继承抽象类Observer
 * 二进制观察者
 */
public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}
