package com.pardeep.myprctice;

public interface PolicyService<T extends Policy> {
    T addPolicy(T t);
    T getPolicy(T t);
}
