package com.Exercise2.smartOffice;

import java.util.ArrayList;
import java.util.List;

public class OfficeConfiguration {
    private static OfficeConfiguration instance;
    private List<Room> rooms;

    private OfficeConfiguration() {
        rooms = new ArrayList<>();
    }

    public static synchronized OfficeConfiguration getInstance() {
        if (instance == null) {
            instance = new OfficeConfiguration();
        }
        return instance;
    }

    public void configureOffice(int roomCount) {
        rooms.clear();
        for (int i = 1; i <= roomCount; i++) {
            rooms.add(new Room(i));
        }
        System.out.println("Office configured with " + roomCount + " meeting rooms.");
    }

    public Room getRoom(int roomNumber) {
        if (roomNumber <= 0 || roomNumber > rooms.size()) {
            return null;
        }
        return rooms.get(roomNumber - 1);
    }
}

