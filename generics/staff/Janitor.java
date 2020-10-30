package com.pardeep.generics.staff;

public class Janitor implements SupportStaff {
    @Override
    public void sendSMS() {
        System.out.println("sent message to Janitor");
    }
}
