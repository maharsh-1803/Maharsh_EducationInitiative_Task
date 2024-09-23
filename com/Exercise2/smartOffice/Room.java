package com.Exercise2.smartOffice;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private int roomNumber;
    private int capacity;
    private boolean occupied;
    private List<OccupancyObserver> observers;
    private boolean booked;
    private int timesUsed;
    private int totalOccupancyTime;
    private int lastBookingDuration; // To store the duration of the last booking

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.observers = new ArrayList<>();
        this.occupied = false;
        this.booked = false;
        this.timesUsed = 0;
        this.totalOccupancyTime = 0;
        this.lastBookingDuration = 0; // Initialize to 0
    }

    public void setCapacity(int capacity) {
        if (capacity > 0) {
            this.capacity = capacity;
            System.out.println("Room " + roomNumber + " maximum capacity set to " + capacity + ".");
        } else {
            System.out.println("Invalid capacity. Please enter a valid positive number.");
        }
    }

    public void addObserver(OccupancyObserver observer) {
        observers.add(observer);
    }

    public void setOccupancy(int persons) {
        if (persons >= 2) {
            this.occupied = true;
            notifyObservers(true);
            System.out.println("Room " + roomNumber + " is now occupied by " + persons + " persons. AC and lights turned on.");
        } else if (persons == 0) {
            this.occupied = false;
            notifyObservers(false);
            System.out.println("Room " + roomNumber + " is now unoccupied. AC and lights turned off.");
        } else {
            System.out.println("Room " + roomNumber + " occupancy insufficient to mark as occupied.");
        }
    }

    private void notifyObservers(boolean status) {
        for (OccupancyObserver observer : observers) {
            observer.update(status);
        }
    }

    // Book room for a specific duration and update statistics accordingly
    public void bookRoom(String time, int duration) {
        if (!this.booked) {
            this.booked = true;
            this.timesUsed++;
            this.totalOccupancyTime += duration;  // Update the total occupancy time based on duration
            this.lastBookingDuration = duration;  // Store the current booking duration for future cancellation

            System.out.println("Room " + roomNumber + " booked from " + time + " for " + duration + " minutes.");
        } else {
            System.out.println("Room " + roomNumber + " is already booked during this time.");
        }
    }

    // Cancel room booking and adjust the statistics accordingly
    public void cancelBooking() {
        if (this.booked) {
            this.booked = false;
            this.totalOccupancyTime -= this.lastBookingDuration; // Subtract the last booking's duration
            System.out.println("Booking for Room " + roomNumber + " cancelled.");
        } else {
            System.out.println("Room " + roomNumber + " is not booked.");
        }
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getTimesUsed() {
        return timesUsed;
    }

    public int getTotalOccupancyTime() {
        return totalOccupancyTime;
    }

    public void displayUsageStatistics() {
        System.out.println("Room " + roomNumber + " usage statistics:");
        System.out.println("Times used: " + timesUsed);
        System.out.println("Total occupancy time: " + totalOccupancyTime + " minutes.");
    }
}

