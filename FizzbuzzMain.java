package service;

import java.util.Scanner;

import main.Fizzbuzz;

public class FizzbuzzMain {

	public static void main(String[] args) {
		Fizzbuzz fizzbuzz=new Fizzbuzz();
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter number:");
				fizzbuzz.number = scanner.nextInt();
				fizzbuzz.values();
				
				
				scanner.close();
			}
		
	}

