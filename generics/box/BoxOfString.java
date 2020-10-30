package com.pardeep.generics.box;

/**
 * Anti-pattern - you will create separate
 * concrete classes like these if Java didn't have Generics feature
 */
public class BoxOfString {
    private String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
