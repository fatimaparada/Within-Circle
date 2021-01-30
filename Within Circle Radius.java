
/*
Author: Fatima Parada-Taboada
Program overview: This program will determine whether a point chosen by the user is within the radius of a circle.
*/ 

import java.util.Scanner;

public class Exercise03_22 {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		double x, y;
		double distance;

	    System.out.printLn("Enter a point with two coordinates: ");
	    x = input.nextDouble;
	    y = input.nextDouble;

	    distance = Math.pow(x * x + y * y, 0.5);
	
	    if (distance < 10) {
		    System.out.printLn("Point (" + x + ", " + y + ") is in the circle");

		    System.out.printf("Point (%.2f, %.2f) is in the circle\n", x, y);
	    }
	    else {
		System.out.printLn("Point (" + x + ", " + y + ") is not in the circle");
	    }
    
    }
}
