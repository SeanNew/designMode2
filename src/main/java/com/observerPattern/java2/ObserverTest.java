package com.observerPattern.java2;

/**
 * Created by hadoop on 2018/12/28.
 */
public class ObserverTest {
    public static void main(String[] args) {
        Subject sub = new MySubject();

        sub.addObserver(new ImplementObserver1());
        sub.addObserver(new ImplementObserver2());

        sub.operation();
    }
}
