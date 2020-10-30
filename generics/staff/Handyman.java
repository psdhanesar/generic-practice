package com.pardeep.generics.staff;

public class Handyman  implements SupportStaff {
    @Override
    public void sendSMS() {
        System.out.println("sent message to HandyMan");
    }
}
