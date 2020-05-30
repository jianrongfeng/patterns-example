package com.fengjr.study;

/**
 * 通知接口
 * @author fengjr
 */
public interface Subject {
    /**
     * 通知
     */
    void notified();

    /**
     * 增加观察者对象
     */
    void attach(Observer subject);

    /**
     * 取消观察者对象
     */
    void detach(Observer subject);
}
