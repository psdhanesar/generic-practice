package com.pardeep.generics.validator2;

/**
 * This class shows a second flavor of using Generics
 * where a generic method works with different types
 * and polymorphically calls their implementations at run-time
 */
public class ValidatorLauncherClass {
    public static void main(String[] args) {
        System.out.println("Hello there validators");
        ValidatorUtil.validateObjects(new Customer());
        ValidatorUtil.validateObjects(new Address());
//        ValidatorUtil.validateObjects(new Teacher());  //compile error, because Teacher doesn't belong to that hierarchy  [T extends DomainObject]

    }
}
