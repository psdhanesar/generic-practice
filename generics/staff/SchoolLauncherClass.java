package com.pardeep.generics.staff;

import java.util.ArrayList;
import java.util.List;

public class SchoolLauncherClass {
    public static void main(String[] args) {
        System.out.println("inside SchoolLauncher Class");
        List<String> list= new ArrayList<>();
        list.add("pardeep");
        list.add("amrit");
        list.add("moohit");
        list.add("ballu");
        System.out.println(list);

        Util.announceToAllStaff(new Janitor());

      //  Util.announceToTeachingStaff(new Janitor()); //compile time error because Janitor is not in Teaching Staff hierarchy
        Util.announceToTeachingStaff(new Principal());
        Util.announceToTeachingStaff(new Teacher());
        Util.announceToTeachingStaff(new ResearchAssistant());
        Util.announceToTeachingStaff(new TeachingAssistant());

        // following will get compile error
//        Util.announceToSupportStaff(new Principal());
//        Util.announceToSupportStaff(new Teacher());
//        Util.announceToSupportStaff(new ResearchAssistant());
        //

        Util.announceToSupportStaff(new Janitor());
        Util.announceToSupportStaff(new Handyman());
        Util.announceToSupportStaff(new BusDriver());
        //
        Util.announceToSupportAndTeachingStaff(new SuperStaff());


        Staff staff = new Volunteer();
        staff.sendSMS();
    }
}
