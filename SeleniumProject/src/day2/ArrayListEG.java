package day2;

import java.util.ArrayList;

public class ArrayListEG 
{

	public static void main(String[] args) 
	{
		ArrayList<Object> x=new ArrayList<>();
		//Write the data into the array
		
		x.add("Selenium");
		x.add("Manual");
		x.add(30000);
		x.add('M');
		x.add(2, "QEdge");
		//Finding the length of the array
		
		System.out.println(x.size());

		for (int i = 0; i < x.size(); i++) 
		{
			System.out.println(x.get(i));
		}
		
	}

}
