package com.Exercise2.smartOffice;

public class AirConditioner implements OccupancyObserver {
    @Override
    public void update(boolean status) {
        if (status) {
            System.out.println("Air conditioner turned ON.");
        } else {
            System.out.println("Air conditioner turned OFF.");
        }
    }
}

