package com.pardeep.generics.box;


public class Box {
    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    //generic method example
    public <T> void printValue(T parameter) {
        System.out.println(parameter);
    }

}
