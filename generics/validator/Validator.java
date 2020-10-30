package com.pardeep.generics.validator;

public interface Validator<T> {
    boolean validate(T t);
}
