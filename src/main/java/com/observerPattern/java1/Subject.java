package com.observerPattern.java1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hadoop on 2018/12/28.
 * Subject 对象带有绑定观察者到 Client 对象和从 Client 对象解绑观察者的方法。
 */
public class Subject {
    private List<Observer> observers
            = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }


    /*添加观察者*/
    public void attach(Observer observer){
        observers.add(observer);
    }
    /*通知所有观察者*/
    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
