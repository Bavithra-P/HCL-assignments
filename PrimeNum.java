package main;

public class PrimeNum {

	int i;
	int value = 0;
	int flag = 0;
	public int number;

	public void isPrime() {
		  value=number/2;      
		  if(number==0||number==1)
		  {  
		   System.out.println(number +" is not prime number");      
		  }
		  else
		  {  
		   for(i=2;i<=value;i++)
		   {      
		    if(number %i==0)
		    {      
		     System.out.println(number +" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0) 
		   { 
			   System.out.println(number +" is prime number"); 
		   }  
		  } 

	}


}
