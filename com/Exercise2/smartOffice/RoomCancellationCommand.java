package com.Exercise2.smartOffice;

public class RoomCancellationCommand implements Command {
    private Room room;

    public RoomCancellationCommand(Room room) {
        this.room = room;
    }

    @Override
    public void execute() {
        if (room.isBooked()) {
            room.setBooked(false);
            System.out.println("Booking for Room " + room.getRoomNumber() + " cancelled successfully.");
        } else {
            System.out.println("Room " + room.getRoomNumber() + " is not booked. Cannot cancel booking.");
        }
    }
}

