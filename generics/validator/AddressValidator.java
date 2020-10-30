package com.pardeep.generics.validator;

public class AddressValidator<Address> implements Validator<Address>{

    @Override
    public boolean validate(Address address) {
        // validate address fields like Street, House Number, CityName, Postal Code etc.
        return false;
    }
}
