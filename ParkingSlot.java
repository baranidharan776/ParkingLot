package com.creditmantri;

import java.util.List;


public class ParkingSlot {
    private List<Slot> parkingSlot;
    private Integer filledSlot ;
    private Integer availableSlot ;
    private Integer totalSlot;


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
