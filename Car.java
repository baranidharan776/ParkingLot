package com.creditmantri;


public class Car {


    private String licencePlate;

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public Car(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    @Override
    public String toString() {
        return "Car " + licencePlate ;
    }
}
