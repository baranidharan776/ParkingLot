package com.sample;

/**
 * Created by gbs04325 on 12/07/2018.
 */
public class Slot {
    private Integer id;
    private Boolean status;
    private Car car;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Slot{" +
                "id=" + id +
                ", status=" + status +
                ", car=" + car +
                '}';
    }
}
