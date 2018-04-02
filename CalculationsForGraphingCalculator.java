package Mathematics;

import java.util.Scanner;

public class CalculationsForGraphingCalculator {

	public static void main(String[] args) {

		System.out.println(
				"Welcome to the data points calculator! This program creates a table of values based on a given formula.");
		System.out.println();
		System.out.print("Please insert your equation (in terms of x): y = ");

		Scanner scan = new Scanner(System.in);
		String formula = scan.nextLine();

		System.out.println();

		System.out.print("Left bound of your domain? ");
		double leftBound = scan.nextDouble();

		System.out.println();

		System.out.print("Right bound of your domain? ");
		double rightBound = scan.nextDouble();

		System.out.println();

		System.out.print("Step of your function (the increments at which the function is evaluated at: ");
		double step = scan.nextDouble();

		System.out.println("x     " + "         y");
		System.out.println("_____________________________");
		
		for (double i = leftBound; i <= rightBound; i += step) {

			System.out.println(i + "     |     " + Math.pow(i, 2) + 2*i + 15);
			
		}
		
		scan.close();

	}

}
