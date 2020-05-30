package com.fengjr.study;

/**
 * 基金会观察着
 * @author fengjr
 */
public class FundsObserver implements Observer{
    @Override
    public void update(Object obj) {
        System.out.println("基金会收到通知:"+obj);
    }
}
