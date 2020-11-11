package main;



public class Average {
	public int temp=0;
	public int avg;
	public int[] array=new int[3];
	 public void average1() {
		for(int i=0; i<array.length; i++)
		{
			temp +=array[i];
		}
		System.out.println(" The Total is " + temp);
		avg =temp/array.length;
	
	}

}
