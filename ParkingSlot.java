package com.sample;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gbs04325 on 12/07/2018.
 */
public class ParkingSlot {
    private List<Slot> parkingSlot;
    private Integer filledSlot ;
    private Integer availableSlot ;
    private Integer totalSlot;

    void generateList(){
        parkingSlot = new ArrayList<>();
        for(int i=0;i<getTotalSlot();i++){
            Slot slot = new Slot();
            slot.setId(i+1);
            slot.setStatus(false);
        }
    }

    public Integer getFilledSlot() {
        return filledSlot;
    }

    public void setFilledSlot(Integer filledSlot) {
        this.filledSlot = filledSlot;
    }

    public Integer getAvailableSlot() {
        return availableSlot;
    }

    public void setAvailableSlot(Integer availableSlot) {
        this.availableSlot = availableSlot;
    }

    public Integer getTotalSlot() {
        return totalSlot;
    }

    public void setTotalSlot(Integer totalSlot) {
        this.totalSlot = totalSlot;
    }

    public List<Slot> getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(List<Slot> parkingSlot) {
        this.parkingSlot = parkingSlot;
    }
}
