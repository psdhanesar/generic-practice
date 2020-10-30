package com.pardeep.generics.staff;

public class TeachingAssistant implements TeachingStaff {
    @Override
    public void sendSMS() {
        System.out.println("sent message to TeachingAssistant");
    }
}
