package com.fengjr.study;

import java.util.ArrayList;
import java.util.List;

/**
 * 股票通知者
 * @author fengjr
 */
public class StockSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String name;
    private String status;

    public StockSubject(String name) {
        this.name = name;
    }

    @Override
    public void notified() {
        observers.forEach(observer -> observer.update(status));
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 下跌
     */
    public void fall(){
        status = name+"股票下跌了";
        System.out.println(status);
        this.notified();
    }

    /**
     * 上涨
     */
    public void rise(){
        status = name+"股票上涨了";
        System.out.println(status);
        this.notified();
    }
}
