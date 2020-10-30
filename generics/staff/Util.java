package com.pardeep.generics.staff;

/**
 * generic methods
 */
public class Util<T extends Staff> {

    public void anyMethod(){
        Staff staff = new BusDriver();
        staff.sendSMS();
    }

    public static <T extends Staff> void announceToAllStaffOfMyChoice(T t) {
        System.out.println("hello");
        t.sendSMS();
    }

    public static <T extends Staff> void announceToAllStaff(T t) {
        t.sendSMS();
    }

    public static <T extends TeachingStaff> void announceToTeachingStaff(T t) {
        t.sendSMS();
    }

    public static <T extends SupportStaff> void announceToSupportStaff(T t) {
        t.sendSMS();
    }

    public static <T extends SupportStaff & TeachingStaff> void announceToSupportAndTeachingStaff(T t) {
        t.sendSMS();
    }
}
