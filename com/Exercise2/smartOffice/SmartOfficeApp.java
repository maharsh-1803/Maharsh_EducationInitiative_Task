package com.Exercise2.smartOffice;

import java.util.Scanner;

public class SmartOfficeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OfficeConfiguration officeConfig = OfficeConfiguration.getInstance();
        MainMenu mainMenu = new MainMenu(officeConfig, scanner);

        mainMenu.run();
    }
}

