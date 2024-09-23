package com.creationalDesignPattern.shapeDrawingApplication;

import java.util.Scanner;

public class ShapeDrawingMain {
    public static void main(String[] args) {
        // Using Factory Method for Shape Drawing
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter shape to draw (circle/square): ");
        String shapeType = scanner.nextLine();

        ShapeFactory factory;
        Shape shape;

        switch (shapeType.toLowerCase()) {
            case "circle":
                factory = new CircleFactory();
                shape = factory.createShape();
                break;
            case "square":
                factory = new SquareFactory();
                shape = factory.createShape();
                break;
            default:
                System.out.println("Unknown shape type!");
                return;
        }

        shape.draw();
    }
}

