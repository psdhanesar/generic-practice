package com.pardeep.generics.validator2;

/**
 * Generic method example
 */
public class ValidatorUtil {
    public static <T extends DomainObject> Boolean validateObjects(T t) {
        return t.validate();
    }
}
