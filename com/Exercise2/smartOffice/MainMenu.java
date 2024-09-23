package com.Exercise2.smartOffice;

import java.util.Scanner;

public class MainMenu {
    private OfficeConfiguration officeConfig;
    private Scanner scanner;

    public MainMenu(OfficeConfiguration officeConfig, Scanner scanner) {
        this.officeConfig = officeConfig;
        this.scanner = scanner;
    }

    public void run() {
        while (true) {
            System.out.println("\n--- Smart Office Management ---");
            System.out.println("1. Configure Office");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Room Booking");
            System.out.println("4. Add Occupants");
            System.out.println("5. Display Room Usage Statistics");
            System.out.println("6. Exit");
            System.out.print("Select an option: ");

            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    configureOffice();
                    break;
                case 2:
                    bookRoom();
                    break;
                case 3:
                    cancelBooking();
                    break;
                case 4:
                    addOccupants();
                    break;
                case 5:
                    displayUsageStatistics();
                    break;
                case 6:
                    System.out.println("Exiting... Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void configureOffice() {
        System.out.print("Enter number of meeting rooms: ");
        int roomCount = scanner.nextInt();
        officeConfig.configureOffice(roomCount);
    }

    private void bookRoom() {
        System.out.print("Enter room number to book: ");
        int roomNumber = scanner.nextInt();
        Room room = officeConfig.getRoom(roomNumber);

        if (room != null) {
            System.out.print("Enter start time (e.g., 09:00): ");
            String startTime = scanner.next();
            System.out.print("Enter duration in minutes: ");
            int duration = scanner.nextInt();

            Command bookRoomCmd = new RoomBookingCommand(room, startTime, duration);
            bookRoomCmd.execute();  // Room will be booked and statistics updated
        } else {
            System.out.println("Invalid room number.");
        }
    }

    private void cancelBooking() {
        System.out.print("Enter room number to cancel booking: ");
        int roomNumber = scanner.nextInt();
        Room room = officeConfig.getRoom(roomNumber);

        if (room != null) {
            Command cancelRoomCmd = new RoomCancellationCommand(room);
            cancelRoomCmd.execute();
        } else {
            System.out.println("Invalid room number.");
        }
    }

    private void addOccupants() {
        System.out.print("Enter room number to add occupants: ");
        int roomNumber = scanner.nextInt();
        Room room = officeConfig.getRoom(roomNumber);

        if (room != null) {
            System.out.print("Enter number of occupants: ");
            int occupants = scanner.nextInt();
            room.setOccupancy(occupants);  // Update occupancy but not statistics (handled by booking)
        } else {
            System.out.println("Invalid room number.");
        }
    }

    private void displayUsageStatistics() {
        System.out.print("Enter room number to view statistics: ");
        int roomNumber = scanner.nextInt();
        Room room = officeConfig.getRoom(roomNumber);

        if (room != null) {
            room.displayUsageStatistics();  // Display statistics for the room
        } else {
            System.out.println("Invalid room number.");
        }
    }
}

