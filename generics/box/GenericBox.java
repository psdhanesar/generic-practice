package com.pardeep.generics.box;

/**
 * Generic Type example
 */
public class GenericBox<S> implements Cloneable {

    private S value;

    public S get() {
        return this.value;
    }

    public void set(S value) {
        this.value = value;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
