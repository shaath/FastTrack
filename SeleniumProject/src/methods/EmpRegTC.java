package methods;

public class EmpRegTC {

	public static void main(String[] args)
	{
		OrangehrmMaster om=new OrangehrmMaster();
		
		String res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Appliction Launch "+res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println("Application Login "+res );
		
		res=om.org_Empreg("Sharath", "Chandra");
		System.out.println("Employee Registration "+res);
		
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		
		om.org_Close();
		System.out.println("Close Successfull");

	}

}
