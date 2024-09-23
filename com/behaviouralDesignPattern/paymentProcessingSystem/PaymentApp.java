package com.behaviouralDesignPattern.paymentProcessingSystem;

import java.util.Scanner;

public class PaymentApp {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = PaymentProcessor.getInstance();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose payment method (1: Credit Card, 2: PayPal, 3: Bitcoin): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                paymentProcessor.setPaymentStrategy(new CreditCardPayment());
                break;
            case 2:
                paymentProcessor.setPaymentStrategy(new PayPalPayment());
                break;
            case 3:
                paymentProcessor.setPaymentStrategy(new BitcoinPayment());
                break;
            default:
                System.out.println("Invalid payment method.");
                return;
        }

        System.out.println("Enter amount to pay: ");
        double amount = scanner.nextDouble();
        paymentProcessor.processPayment(amount);

        scanner.close();
    }
}

