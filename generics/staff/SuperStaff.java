package com.pardeep.generics.staff;

public class SuperStaff implements SupportStaff, TeachingStaff {
    @Override
    public void sendSMS() {
        System.out.println("message sent to SuperStaff");
    }
}
