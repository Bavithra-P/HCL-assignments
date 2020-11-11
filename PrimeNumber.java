package service;

import java.util.Scanner;

import main.Calculation;
import main.PrimeNum;

public class PrimeNumber {

	public static void main(String[] args) {
		PrimeNum  primeNum=new PrimeNum();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number ");
	    primeNum.number = scanner.nextInt();
	    primeNum.isPrime();

	}

}
