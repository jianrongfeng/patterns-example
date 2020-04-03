package com.fengjr.study;

import com.fengjr.study.patterns.Person;
import com.fengjr.study.patterns.finery.Shirt;
import com.fengjr.study.patterns.finery.Suit;
import com.fengjr.study.patterns.finery.TShirt;

/**
 * @author fengjr
 * @date 2020/4/3.
 */
public class Test {

    @org.junit.Test
    public void dressup(){
        Person bao = new Person("大宝");
        TShirt tShirt = new TShirt();
        Shirt shirt = new Shirt();
        Suit suit = new Suit();

        // 先把"T恤"给"人"穿
        tShirt.decorate(bao);
        // 再把"衬衫"穿给"穿着T恤的人"
        shirt.decorate(tShirt);
        // 最后把"西服"穿给"穿着衬衫和T恤的人"
        suit.decorate(shirt);

        //看下最后的穿着效果
        suit.show();
    }
}
