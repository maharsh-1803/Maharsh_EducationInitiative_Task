package com.creationalDesignPattern.GUIFramework;

import java.util.Scanner;

public class GUIApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose theme (light/dark): ");
        String theme = scanner.nextLine();

        GUIFactory factory;
        if (theme.equalsIgnoreCase("light")) {
            factory = new LightThemeFactory();
        } else if (theme.equalsIgnoreCase("dark")) {
            factory = new DarkThemeFactory();
        } else {
            System.out.println("Unknown theme! Defaulting to Light theme.");
            factory = new LightThemeFactory();
        }

        Button button = factory.createButton();
        TextBox textBox = factory.createTextBox();

        button.render();
        textBox.render();
    }
}

