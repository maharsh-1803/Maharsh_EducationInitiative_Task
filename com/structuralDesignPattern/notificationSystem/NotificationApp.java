package com.structuralDesignPattern.notificationSystem;

import java.util.Scanner;

public class NotificationApp {
    public static void main(String[] args) {
        Notification emailNotification = new EmailNotification();
        Notification smsNotification = new SMSNotification();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose notification type (1 for Email, 2 for SMS): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        System.out.println("Enter your message: ");
        String message = scanner.nextLine();

        if (choice == 1) {
            emailNotification.setSender(new EmailSender());
            emailNotification.notifyUser(message);
        } else if (choice == 2) {
            smsNotification.setSender(new SMSSender());
            smsNotification.notifyUser(message);
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
