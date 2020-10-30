package com.pardeep.generics.staff;

public class Volunteer implements TemporaryStaff {
    @Override
    public void sendSMS() {
        System.out.println("sent message to Volunteer");
    }

    public void tempStaffMethod(){
        System.out.println("temp staff method");
    }
}
