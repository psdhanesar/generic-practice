package com.pardeep.generics.validator;

import java.util.ArrayList;
import java.util.List;

/**
 * This class shows a flavor of using Generic Classes
 */
public class ValidatorLauncherClass {
    public static void main(String[] args) {
        System.out.println("Hello there validators");
        AddressValidator<Address> addressAddressValidator = new AddressValidator<>();
        addressAddressValidator.validate(new Address());
        //
        CustomerValidator<Customer> customerValidator = new CustomerValidator<>();
        customerValidator.validate(new Customer());
        //
        List<Customer> listOfCustomers = new ArrayList<>();
        listOfCustomers.add(new Customer());

        List<Address> listOfAddresses = new ArrayList<>();
        listOfAddresses.add(new Address());
        //
        List<? extends DomainObject> listOfDomainObjects = new ArrayList<>();
        listOfDomainObjects = listOfAddresses;

    }
}
