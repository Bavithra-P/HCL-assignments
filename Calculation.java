package main;

public  class Calculation {
	 public int number1;
	 public int number2;
	 public int answer;
	 public int option;
	 

	  public void operations(){
		switch(option) 
		 {
		 	case 1:
			 answer = number1 +number2;
			 System.out.println(" The SUM of"	+number1 + "and"  +number2+  "is" + answer);
			 break;
			 
		 	case 2:
			 answer= number1 - number2;
			 System.out.println(" The DIFFERENCE of" + number1 + " and" + number2 + "is" + answer );
			 break;
			 
		 	case 3:
			 answer= number1  * number2;
			 System.out.println(" The PRODUCT of" + number1 + " and" + number2 + "is"  + answer);
			 break;
			 
		 	case 4:
			 answer= number1 / number2;
			 System.out.println(" The DIVISION of" + number1 + " and" + number2 + "is" + answer);
			 break;
			 
		 	case 5:
			 answer = number1 % number2;
			 System.out.println(" The MODULUS of" + number1 + " and" + number2 + "is" + answer);
			 break;
			 
		 	default:
			 System.out.println(" choose another choice");
	 }
		
}

}
