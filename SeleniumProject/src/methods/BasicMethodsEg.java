package methods;

public class BasicMethodsEg {

	public static void main(String[] args)
	{
		function1();

		String res=function2();
		System.out.println(res);
		
		BasicMethodsEg bm=new BasicMethodsEg();
		bm.function3();
		
		boolean flag=bm.finction4();
		System.out.println(flag);
		
	}
	
	//static method without returning anyvalue
	
	public static void function1()
	{
		System.out.println("This is Function1 code");
	}
	
	//static method with returning the value
	
	public static String function2()
	{
		System.out.println("This is Function2 code");
		return "Pass";
		
		
	}
	
	//Non static Method without returning value
	
	public void function3()
	{
		
		System.out.println("This is Function3 code");
	}

	//Non static method with returning value
	
	public boolean finction4()
	{
		System.out.println("This is Function4 code");
		return true;
	}
	
	public int sum(int a,int b)
	{
		
		int c=a+b;
		return c;
	}
}
