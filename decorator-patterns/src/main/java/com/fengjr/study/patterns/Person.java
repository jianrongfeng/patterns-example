package com.fengjr.study.patterns;

/**
 * @author fengjr
 * @date 2020/4/3.
 */
public class Person implements Finery{

    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public void show() {
        System.out.print(String.format("%s穿着", name));
    }
}
