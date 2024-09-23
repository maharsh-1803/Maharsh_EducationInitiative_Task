package com.structuralDesignPattern.notificationSystem;

public abstract class Notification {
    protected NotificationSender sender;

    public void setSender(NotificationSender sender) {
        this.sender = sender;
    }

    public abstract void notifyUser(String message);
}
