package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class GmailLogin {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Cdownloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launching the firefox browser
//		FirefoxDriver driver=new FirefoxDriver();
		//Launch The gmail application
		driver.get("http://gmail.com");
		//Maximize the window
		driver.manage().window().maximize();
		//Identifying the email text box
		WebElement email=driver.findElement(By.id("Email"));
		
		//Sending text into the text box
		
		email.sendKeys("sharathqedge449");
		
//		Sleeper.sleepTightInSeconds(5);
//		email.clear();
		
		//Clicking on next button
		
		driver.findElement(By.name("signIn")).click();
		Sleeper.sleepTightInSeconds(5);
		//Entering text into password textbox
		
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("123456789");
		
		driver.findElement(By.cssSelector("#signIn")).click();

	}

}
