package com.pardeep.myprctice;

public class HouseholdPolicy extends Policy {
    String nameOfCustomer;

    public HouseholdPolicy(int policyNumber, String nameOfCustomer) {
        super(policyNumber);
        this.nameOfCustomer = nameOfCustomer;
    }

    public String getNameOfCustomer() {
        return nameOfCustomer;
    }

    public void setNameOfCustomer(String nameOfCustomer) {
        this.nameOfCustomer = nameOfCustomer;
    }

    @Override
    public String toString() {
        return "HouseholdPolicy{" +
                "nameOfCustomer='" + nameOfCustomer + '\'' +
                ", policyNumber=" + policyNumber +
                "} " + super.toString();
    }
}
