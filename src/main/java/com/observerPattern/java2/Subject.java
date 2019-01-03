package com.observerPattern.java2;

/**
 * Created by hadoop on 2018/12/28.
 */
public interface Subject {
    /*增加观察者*/
    public void addObserver(Observer observer);
    /*删除观察者*/
    public void delObserver(Observer observer);
    /*通知所有观察者*/
    public void notifyAllObserver();

    /*自身的操作*/
    public void operation();
}
