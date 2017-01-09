package day1;

public class StringOps {

	public static void main(String[] args) 
	{
		String s="QEdge";
		//Finding the length of the string
		int len=s.length();
		System.out.println(len);
		
//		char x=s.charAt(2);
//		System.out.println(x);
		
		for (int i = 0; i < len; i++) 
		{
			System.out.println(s.charAt(i));
		}
		
		System.out.println("******");
		for (int i = len-1; i >= 0; i--) 
		{
			System.out.print(s.charAt(i));
		}
	}

}
