package day1;

public class DynamicArraysEg {

	public static void main(String[] args)
	{
		Object[] x=new Object[10];
		
		System.out.println(x.length);
		
		//Writing the data into an array
		
		x[7]="Selenium";
		x[4]=70000;
		x[4]=5000;
		x[10]="Sharath";
		for (int i = 0; i < x.length; i++)
		{
			System.out.println(x[i]);
		}

	}

}
