package com.pardeep.generics.validator2;

/**
 * This is a case where Domain Object provides its own valiation logic
 */
public class Address implements DomainObject {
    @Override
    public Boolean validate() {
        //provide some implementation
        // validate address fields like Street, House Number, CityName, Postal Code etc.
        return false;
    }
}
