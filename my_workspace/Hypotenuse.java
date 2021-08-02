package my_workspace;

import java.util.Scanner;

public class Hypotenuse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Double a = Double.parseDouble(scan.nextLine());
		Double b = Double.parseDouble(scan.nextLine());
		System.out.print(calculateHypotenuse(a, b));

		

	}
	public static double calculateHypotenuse(double a, double b) {
		double c = Math.sqrt(a*a + b*b);
		return c;
		
		
	}

}
