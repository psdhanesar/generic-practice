package com.pardeep.generics.box;

/**
 * Anti-pattern - you will create separate concrete
 * classes like these if Java didn't have Generics feature
 */
public class BoxOfInteger {
    private Integer integer;

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }
}
