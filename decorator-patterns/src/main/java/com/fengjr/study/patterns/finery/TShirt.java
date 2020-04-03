package com.fengjr.study.patterns.finery;

import com.fengjr.study.patterns.AbstractFinery;

/**
 * T恤
 * @author fengjr
 * @date 2020/4/3.
 */
public class TShirt extends AbstractFinery {
    @Override
    public void show() {
        super.show();
        System.out.print(" T恤");
    }
}
