package service;

import java.util.Scanner;

import main.Swap;

public class SwapMain {

	public static void main(String[] args) {
		
		Swap swap=new Swap();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number ");
	    swap.value1= scanner.nextInt();
	    
	    Scanner scanner1 = new Scanner(System.in);
		System.out.println("Enter second number ");
	    swap.value2 = scanner1.nextInt();
       
	    System.out.println("Before Swapping    Value1= " + swap.value1 + " value2 " + swap.value2 );
	    
	    swap.swapping();
	}

}
