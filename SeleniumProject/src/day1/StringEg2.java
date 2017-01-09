package day1;

public class StringEg2
{
	public static void main(String[] args) 
	{
		String a="you are selected SElenium";
		String b="selenium";
		
//		System.out.println(a.toUpperCase());
//		
//		System.out.println(a.toLowerCase());
		
		if (a.equalsIgnoreCase(b))
		{
			System.out.println("Both the variables are same");
			
		}
		else
		{
			System.out.println("both the variables are not same");
		}
		
		
		if (a.contains(b))
		{
			System.out.println("Selenium available in A");
		}
		else
		{
			System.out.println("Selenium is not available in A");
		}
		
		System.out.println(a+"*************"+b);
	}

}
