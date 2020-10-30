package com.pardeep.generics.staff;

public class BusDriver implements SupportStaff {
    @Override
    public void sendSMS() {
        System.out.println("sent message to Janitor");
    }
}
