package com.behaviouralDesignPattern.paymentProcessingSystem;

public class BitcoinPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Bitcoin.");
    }
}

