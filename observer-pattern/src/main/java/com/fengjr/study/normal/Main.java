package com.fengjr.study;

import com.fengjr.study.normal.FundsObserver;
import com.fengjr.study.normal.PersonObserver;
import com.fengjr.study.normal.StockSubject;

/**
 * @author fengjr
 */
public class Main {
    public static void main(String[] args) {
        StockSubject aStock = new StockSubject("A股");
        FundsObserver fundsObserver = new FundsObserver();
        PersonObserver personObserver = new PersonObserver();
        aStock.attach(fundsObserver);
        aStock.attach(personObserver);

        aStock.rise();
        aStock.fall();
    }
}
