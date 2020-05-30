package com.fengjr.study.normal;

/**
 * 个人观察者
 * @author fengjr
 */
public class PersonObserver implements Observer{
    @Override
    public void update(Object obj) {
        System.out.println("股票爱好者收到通知："+obj);
    }
}
