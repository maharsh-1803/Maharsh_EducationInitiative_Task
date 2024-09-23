package com.behaviouralDesignPattern.paymentProcessingSystem;

public class PaymentProcessor {
    private static PaymentProcessor instance;
    private PaymentStrategy paymentStrategy;

    private PaymentProcessor() {}

    public static synchronized PaymentProcessor getInstance() {
        if (instance == null) {
            instance = new PaymentProcessor();
        }
        return instance;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount) {
        if (paymentStrategy != null) {
            paymentStrategy.pay(amount);
        } else {
            System.out.println("Payment method not selected.");
        }
    }
}

