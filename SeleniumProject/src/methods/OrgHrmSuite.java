package methods;

public class OrgHrmSuite {

	public static void main(String[] args) 
	{
		OrangehrmMaster om=new OrangehrmMaster();
		//Login
	
		String res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Appliction Launch "+res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println("Application Login "+res );
		
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		
		om.org_Close();
		System.out.println("Close Successfull");

		//EmpReg
		
		res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Appliction Launch "+res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println("Application Login "+res );
		
		res=om.org_Empreg("Sharath", "Chandra");
		System.out.println("Employee Registration "+res);
		
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		
		om.org_Close();
		System.out.println("Close Successfull");
		//User reg
		
		res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Appliction Launch "+res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println("Application Login "+res );
		
		res=om.org_Userreg("Sharath Chandra", "SharathChandra123456", "SharathChandra123456", "SharathChandra123456");
		System.out.println("User Registration "+res);
		
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		
		om.org_Close();
		System.out.println("Close Successfull");
		
		//User Login
		
		res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Appliction Launch "+res);
		
		res=om.org_Login("SharathChandra123456", "SharathChandra123456");
		System.out.println("Application Login "+res );
		
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		
		om.org_Close();
		System.out.println("Close Successfull");

	}

}
