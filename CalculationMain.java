package service;

import java.util.Scanner;

import main.Calculation;

public class CalculationMain {

	public static void main(String[] args) {
		Calculation calculation = new Calculation();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number ");
	    calculation.number1 = scanner.nextInt();
	    
	    Scanner scanner1 = new Scanner(System.in);
		System.out.println("Enter second number ");
	    calculation.number2 = scanner1.nextInt();
	    
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Choose 1 for ADDITION \n Choose 2 for SUBTRACTION \n Choose 3 for MULTIPLICATION \n Choose 4 for DIVISION \n Choose 5 for MODULUS");
		System.out.println("Enter your choice ");
	    calculation.option = scanner2.nextInt();
	    
		
		calculation.operations();

	}

}
