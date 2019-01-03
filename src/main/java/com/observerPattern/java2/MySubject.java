package com.observerPattern.java2;

/**
 * Created by hadoop on 2018/12/28.
 */
public class MySubject extends AbstractSubject {

    public void addObserver(Observer observer) {

    }

    public void delObserver(Observer observer) {

    }

    public void notifyAllObserver() {

    }

    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }
}
