package com.fengjr.study.patterns.finery;

import com.fengjr.study.patterns.AbstractFinery;

/**
 * 衬衣
 * @author fengjr
 * @date 2020/4/3.
 */
public class Shirt extends AbstractFinery {
    @Override
    public void show() {
        super.show();
        System.out.print(" 衬衣");
    }
}
