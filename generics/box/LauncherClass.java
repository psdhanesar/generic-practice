package com.pardeep.generics.box;

import com.pardeep.generics.validator.Customer;

import java.util.*;

public class LauncherClass {
    public static void main(String[] args) {
        System.out.println("Hello there");

        /**
         Anti-pattern - when you don't use Generics, you will create separate classes for each type.
         */
        BoxOfInteger boxOfInteger = new BoxOfInteger();
        boxOfInteger.setInteger(1);
        //
        BoxOfString boxOfString = new BoxOfString();
        boxOfString.setString("hello");

        /**
         With Generics, you can do generic type invocations
         for different type arguments using the same Generic Type
         */
        //ability to work with any type , so generic functionality
        GenericBox<String> genericBoxOfStrings = new GenericBox<>();
        //genericBoxOfStrings.set(1);    //compile error - compile time safety
        genericBoxOfStrings.set("hello");//only works with String type argument - compile time safety
        String string = genericBoxOfStrings.get(); // no need of type casts, so cleaner code
        // no risk of run time ClassCastExceptions, so more reliable code at runtime
        //
        GenericBox<Integer> genericBoxOfIntegers = new GenericBox<>();
        genericBoxOfIntegers.set(1);
        Integer integer = genericBoxOfIntegers.get();
        //
        GenericBox<Customer> customerGenericBox = new GenericBox<>();
        customerGenericBox.set(new Customer());
        Customer customer = customerGenericBox.get();

        /**
         * Generics do not work with primitive types
         * Object is superclass of all objects and can represent any user defined object.
         * Since all primitives doesn't inherit from "Object" so we can't use it as a generic type.
         */
        //GenericBox<int> boxOfInts = new GenericBox<int>();


        //
        Box b = new Box();
        b.printValue(1);
        b.printValue("hello");

        // Generics and subtype/hierarchy
        GenericBox<Number> boxOfNumbers = new GenericBox<>();
        boxOfNumbers.set(new Integer(1));
        boxOfNumbers.set(new Float(1.2));
        boxOfNumbers.set(new Double(2.2));
        boxOfNumbers.set(new Long(23424));

        //
        //https://docs.oracle.com/javase/tutorial/java/generics/inheritance.html

        Number number = new Integer(123);

        GenericBox<Integer> integerGenericBox = new GenericBox<>();
//        GenericBox<Number> genericBoxNumber = integerGenericBox;

        GenericBox<Integer> boxOfIntegers = new GenericBox<>();

//        boxOfNumbers = boxOfInteger;  //compile time error

//        SubGenericBox<Number> subGenericBoxOfNumbers = new SubGenericBox<>();
//        boxOfNumbers = subGenericBoxOfNumbers;
//        //
//        SubGenericBox<String> subGenericBoxOfStrings = new SubGenericBox<>();
//        //
//        DoubleSubGenericBox<Number, String> doubleSubGenericBox = new DoubleSubGenericBox<>();
//        subGenericBoxOfNumbers = doubleSubGenericBox;
//        //
//        subGenericBoxOfStrings = doubleSubGenericBox;

        SubGenericBox<Integer, String> subGenericBox = new SubGenericBox<>();

        //
        List<String> stringList = new ArrayList<>();
        stringList.add("string1");
        stringList.add("string1");
        stringList.add("string1");
        stringList.add("string1");

//        stringList.add(123123);

        anotherFunction(stringList);

        Queue<String> stringQueue = new LinkedList<>();
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put("One", 1);
        stringIntegerMap.put("Two", 2);
//        stringIntegerMap.put("Three", "Robin");
        //


        OrderedMapEntryWithMultipleType<String, Integer> orderedMapEntryWithMultipleType
                = new OrderedMapEntryWithMultipleType<>();

        orderedMapEntryWithMultipleType.setKey("One");
        orderedMapEntryWithMultipleType.setValue(1);


        OrderedMapEntryWithMultipleType<String, String> orderedMapEntryWithMultipleTypeSTringSTring
                = new OrderedMapEntryWithMultipleType<>();

        orderedMapEntryWithMultipleTypeSTringSTring.setKey("One");
        orderedMapEntryWithMultipleTypeSTringSTring.setValue("One");


    }

    private static void anotherFunction(List<String> stringList) {
        String string = (String) stringList.get(0);
    }
}
