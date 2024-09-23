package com.Exercise2.smartOffice;

public class Light implements OccupancyObserver {
    @Override
    public void update(boolean status) {
        if (status) {
            System.out.println("Lights turned on.");
        } else {
            System.out.println("Lights turned off.");
        }
    }
}

