package day1;

public class NestedIf {

	public static void main(String[] args) 
	{
		int a=5000;
		int b=40000;
		int c=10000;
		
		if (a > b & a > c)
		{
			System.out.println("A is greater");
			
		}
		else if(b>c & b>a)
		{
			System.out.println("B is greater");
		}
		else
		{
			System.out.println("C is Greater");
		}

	}

}
