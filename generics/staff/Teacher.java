package com.pardeep.generics.staff;
public class Teacher implements TeachingStaff {
    @Override
    public void sendSMS() {
        System.out.println("sent message to Teacher");
    }
}
