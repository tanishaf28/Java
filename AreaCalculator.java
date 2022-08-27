package com.jap.areacalculator;

import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an option from list to calculate area of fence");
        System.out.println("1. Square area for the chickens");
        System.out.println("2. Circular area for ducks");
        System.out.println("3. Rectangular area for cows");
        System.out.println();
        // Input choice from user
        int choice = scanner.nextInt();
		AreaCalculator ab=new AreaCalculator();
        // Make a call to calculateAreaOfFence(int choice) and pass the choice made by user to it
		ab.calculateAreaOfFence(choice);

    }

    // Function to calculate area of fence by calling respective methods according to user's choice
    public void calculateAreaOfFence(int choice) {
		Scanner sc=new Scanner(System.in);
		AreaCalculator a=new AreaCalculator();
		double result;
		switch(choice){
			case 1:System.out.println("Enter side of square");
			double s=sc.nextDouble();
			result=a.calculateAreaOfSquare(s);
			System.out.println("Area of square fence for chickens is "+result);
			break;
			case 2:System.out.println("Enter radius of circle");
			double r=sc.nextDouble();
			result=a.calculateAreaOfCircle(r);
			System.out.println("Area of circular fence for ducks is "+result);
			break;
			case 3:System.out.println("Enter length of rectangle");
			double l=sc.nextDouble();
			System.out.println("Enter breadth of rectangle");
			double b=sc.nextDouble();
			result=a.calculateAreaOfRectangle(l,b);
			System.out.println("Area of rectangular fence for cows is "+result);
			break;


		}

    }

    // Function to calculate area of square
    public double calculateAreaOfSquare(double side) {
        return side*side;
    }

    // Function to calculate area of circle
    public double calculateAreaOfCircle(double radius) {
        return 3.14*radius*radius;
    }

    // Function to calculate area of rectangle
    public double calculateAreaOfRectangle(double length, double breadth) {
        return length*breadth;
    }
}
