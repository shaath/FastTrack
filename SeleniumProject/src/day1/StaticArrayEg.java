package day1;

public class StaticArrayEg {

	public static void main(String[] args) 
	{
		int[] salary={3000,4000,5000,6000,7000};
		
		//Finding the length of the array
		
		System.out.println(salary.length);
		
		//Rading the values from an array
		
//		System.out.println(salary[2]);
		

//		for (int i = 0; i < salary.length; i++) 
//		{
//			System.out.println(salary[i]);
//		}
		
		for (int i : salary) 
		{
			System.out.println(i);
		}
	}

}
