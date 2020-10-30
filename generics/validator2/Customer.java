package com.pardeep.generics.validator2;

public class Customer implements DomainObject {
    @Override
    // validate customer fields like name, address, age etc.
    public Boolean validate() {
        return true;
    }
}
