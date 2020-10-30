package com.pardeep.generics.staff;

public class Principal implements TeachingStaff {
    @Override
    public void sendSMS() {
        System.out.println("sms sent to principal");
    }
}
