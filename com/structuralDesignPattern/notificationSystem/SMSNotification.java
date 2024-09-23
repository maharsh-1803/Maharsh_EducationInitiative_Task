package com.structuralDesignPattern.notificationSystem;

public class SMSNotification extends Notification {

    @Override
    public void notifyUser(String message) {
        if (sender != null) {
            sender.sendNotification("SMS: " + message);
        } else {
            System.out.println("No sender defined for SMS Notification.");
        }
    }
}
