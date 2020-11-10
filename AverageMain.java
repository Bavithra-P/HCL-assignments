package service;

import main.Average;

public class AverageMain {

	public static void main(String[] args) {
		
		Average average = new Average();
		average.array[0]=6;
		average.array[1]=6;
		average.array[2]=3;
		
		
		average.average1();
		System.out.println(" The average of three numbers is " + average.avg);
		
		

	}

}
