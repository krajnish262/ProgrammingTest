package com.example.selfprogrammingtest.SelfOopsTest;

public class Bus extends Auto {
    private String wcStatus;

    public Bus() {
        this.setAirCondition(true);
        this.setDoors(2);
        this.tires = new Tube[6];
        this.passenger = new Employee[20];
    }

    public String getWcStatus() {
        return wcStatus;

    }

    public void setWcStatus(String wcStatus) {
        this.wcStatus = wcStatus;
    }
}
