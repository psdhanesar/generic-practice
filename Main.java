package com.pardeep;

import com.pardeep.generics.box.Box;
import com.pardeep.generics.box.GenericBox;
import com.pardeep.generics.box.SubGenericBox;
import com.pardeep.myprctice.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        GenericBox rawBox = new GenericBox();
//        rawBox.set("hello this is string");
//        System.out.println(rawBox.get());
//        rawBox.set(12);
//        System.out.println(rawBox.get());
//
//        GenericBox<String> stringGenericBox = new GenericBox<>();
//        rawBox = stringGenericBox;
//        stringGenericBox.set("this is the new value");
//        System.out.println(stringGenericBox.get());
//        System.out.println(rawBox.get());
//        stringGenericBox = rawBox;
//        rawBox.set(1);
//        System.out.println(stringGenericBox.get());

        Policy policy = new HouseholdPolicy(1,"house hold policy");
        LifePolicy lifePolicy = new LifePolicy(2,"this is the vehicle/life policy");
        PolicyService<LifePolicy> lifePolicyPolicyService = new PolicyServiceImpl<>();
        PolicyService<HouseholdPolicy> householdPolicyPolicyService = new PolicyServiceImpl<>();
        lifePolicyPolicyService.addPolicy(lifePolicy);
    }
//    public static void swap(List<?> list, int i, int j) {
//        list.set(i, list.set(j, list.get(i)));
//    }
//    void foo(List<?> i) {
//        i.set(0, i.get(0));
//    }
}
