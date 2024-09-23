package com.Exercise2.smartOffice;

public class RoomBookingCommand implements Command {
    private Room room;
    private String time;
    private int duration;

    public RoomBookingCommand(Room room, String time, int duration) {
        this.room = room;
        this.time = time;
        this.duration = duration;
    }

    @Override
    public void execute() {
        room.bookRoom(time, duration);  // Book the room and update statistics
    }
}

