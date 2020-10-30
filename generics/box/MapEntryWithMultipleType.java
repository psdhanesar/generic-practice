package com.pardeep.generics.box;

interface MapEntryWithMultipleType<K,V> {
    K getKey();
    V getValue();

    void setKey(K key);
    void setValue(V value);
}
