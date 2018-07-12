package com.sample;

import java.util.*;

/**
 * Created by gbs04325 on 12/07/2018.
 */
public class ParkingSpace {

    private ParkingSlot parkingSlot;


    public void initialize(int count){
        parkingSlot.setAvailableSlot(count);
        parkingSlot.setTotalSlot(count);
        parkingSlot.setFilledSlot(0);
        parkingSlot.generateList();
        System.out.println("Parking is Initialized Successfully");
    }

    public void checkStatus(){
        System.out.println(" Available Slot in the Parking : "+ parkingSlot.getAvailableSlot());
        System.out.println(" Filled Slot in the Parking : "+ parkingSlot.getFilledSlot());
    }

    public Boolean isAvailable(){
        if(parkingSlot.getAvailableSlot() > 0){
            return true;
        }else{
            return false;
        }
    }


    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public void parkCar(String licencePlate) {
        List<Slot> slotList = parkingSlot.getParkingSlot();
        for (Slot slot:slotList
             ) {
            if(!slot.getStatus()){
               slot.setStatus(true);
               slot.setCar(new Car(licencePlate));
               break;
            }
        }
        System.out.println(parkingSlot.getParkingSlot().size() + " Size");
        parkingSlot.setParkingSlot(slotList);
        parkingSlot.setAvailableSlot(parkingSlot.getAvailableSlot()-1);
        parkingSlot.setFilledSlot(parkingSlot.getFilledSlot()+1);
        checkStatus();
    }

    public void leaveParking(String licencePlate) {
    }

    public void display() {
        for (Slot slot:parkingSlot.getParkingSlot()
             ) {
            if(slot.getStatus()){
                System.out.println("Slot No : "+ slot.getId() + " Car No : "+slot.getCar());
            }
        }
    }
}
