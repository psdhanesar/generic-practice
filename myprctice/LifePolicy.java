package com.pardeep.myprctice;

public class LifePolicy extends Policy {
    String vehicle;

    public LifePolicy(int policyNumber, String vehicle) {
        super(policyNumber);
        this.vehicle = vehicle;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "LifePolicy{" +
                "vehicle='" + vehicle + '\'' +
                ", policyNumber=" + policyNumber +
                "} " + super.toString();
    }
}
