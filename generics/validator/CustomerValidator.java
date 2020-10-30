package com.pardeep.generics.validator;

public class CustomerValidator<Customer> implements Validator<Customer> {

    @Override
    public boolean validate(Customer customer) {
        // validate customer fields like name, address, age etc.
        return false;
    }
}
