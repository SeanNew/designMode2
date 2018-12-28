package com.observerPattern.java1;

/**
 * Created by hadoop on 2018/12/28.
 * Observer: 观察者
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
