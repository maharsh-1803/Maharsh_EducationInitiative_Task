package com.structuralDesignPattern.notificationSystem;

public class EmailSender implements NotificationSender {

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Email: " + message);
    }
}
