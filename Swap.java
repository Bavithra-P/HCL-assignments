package main;

public class Swap {
	public int temp;
	public int value1;
	public int value2;
	
	public void swapping() {
		temp=value1;
		value1=value2;
		value2=temp;
		
		System.out.println("After Swapping    Value1= " + value1 + " value2 " + value2 );
		
	}
	

}
