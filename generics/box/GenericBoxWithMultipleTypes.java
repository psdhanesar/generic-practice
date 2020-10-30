package com.pardeep.generics.box;

/**
 * Generic Type example
 */
public class GenericBoxWithMultipleTypes<A,U,V> {

    private A value;

    private U value2;

    private V value3;


    public A getValue() {
        return value;
    }

    public void setValue(A value) {
        this.value = value;
    }

    public U getValue2() {
        return value2;
    }

    public void setValue2(U value2) {
        this.value2 = value2;
    }

    public V getValue3() {
        return value3;
    }

    public void setValue3(V value3) {
        this.value3 = value3;
    }
}
