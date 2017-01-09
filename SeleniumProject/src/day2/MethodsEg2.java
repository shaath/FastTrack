package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MethodsEg2 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		//Getting the title of the page
		
//		System.out.println(driver.getTitle());

		//Getting url of the page
		
//		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getPageSource());
		
		//close the browser
		
		driver.close();
	}

}
