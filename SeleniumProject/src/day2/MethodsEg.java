package day2;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class MethodsEg {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		Sleeper.sleepTightInSeconds(5);
		//Redirecting to facebook
		driver.navigate().to("http://facebook.com");
		Sleeper.sleepTightInSeconds(5);
		//Come back to google
		driver.navigate().back();
		Sleeper.sleepTightInSeconds(5);
		//Going to face book
		driver.navigate().forward();
		Sleeper.sleepTightInSeconds(5);
		//Refresh the page
		driver.navigate().refresh();
	}

}
