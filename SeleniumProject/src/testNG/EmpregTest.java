package testNG;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmpregTest extends TestNGMaster
{
	@Test(dataProvider="data")
	public void org_Empreg(String f1, String l1)
	{
		expval=f1+" "+l1;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys(f1);
		driver.findElement(By.id("lastName")).sendKeys(l1);
		driver.findElement(By.id("btnSave")).click();
		actval=driver.findElement(By.xpath("//*[@id='profile-pic']/h1")).getText();
		Assert.assertEquals(actval, expval,"Emp reg Failed");
	}
	
	@DataProvider
	public Object[][] data()
	{
		Object[][] d=new Object[2][2];
		
		
		d[0][0]="Venkat";
		d[0][1]="Ch";
		
		d[1][0]="Sandeep";
		d[1][1]="Kumar";
		
		return d;		
	}

}
