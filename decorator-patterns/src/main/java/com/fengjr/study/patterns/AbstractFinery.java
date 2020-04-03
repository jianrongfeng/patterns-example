package com.fengjr.study.patterns;

/**
 * 服装抽象类，提供默认的一些动作
 * @author fengjr
 * @date 2020/4/3.
 */
public abstract class AbstractFinery implements Finery{

    // 已经装饰过的穿着服装的人
    private Finery person;

    // 给人穿装饰
    public AbstractFinery decorate(Finery finery){
        person = finery;
        return this;
    }

    // 人走秀
    public void show(){
        if (person != null)
            person.show();
    }

}
