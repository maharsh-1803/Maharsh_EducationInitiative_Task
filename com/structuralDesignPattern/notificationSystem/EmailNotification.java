package com.structuralDesignPattern.notificationSystem;

public class EmailNotification extends Notification {

    @Override
    public void notifyUser(String message) {
        if (sender != null) {
            sender.sendNotification("Email: " + message);
        } else {
            System.out.println("No sender defined for Email Notification.");
        }
    }
}
