package org.example;

import java.util.*;
import java.lang.Math;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void calculateCircleArea(){
        // pi r squared
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double rad = input.nextDouble();

        double circleArea = Math.PI * rad * rad;
        System.out.printf("Area of the circle: " + "%.2f%n", circleArea);
    }

    static void calculateTriangleArea(){
        // .5 x base x height
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base: ");
        double b = input.nextDouble();
        System.out.print("Enter height: ");
        double h = input.nextDouble();

        double triangleArea = 0.5 * b * h;
        System.out.printf("Area of the triangle: " + "%.2f%n", triangleArea);
    }

    static void calculateRectangleArea(){
        // l x w
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length: ");
        double l = input.nextDouble();
        System.out.print("Enter width: ");
        double w = input.nextDouble();

        double rectangleArea = l * w;
        System.out.printf("Area of the triangle: " + "%.2f%n", rectangleArea);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Area Calculator ===");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Rectangle");
        System.out.print("Choose a shape: (1-3): ");

        int choice = input.nextInt();
        switch (choice) {
            case 1:
                calculateCircleArea();
                break;
            case 2:
                calculateTriangleArea();
                break;
            case 3:
                calculateRectangleArea();
                break;
        }
    }
}