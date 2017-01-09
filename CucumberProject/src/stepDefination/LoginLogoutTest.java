package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginLogoutTest 
{
	public static WebDriver driver;
	@Given("^user launches the browser and navigated to url$")
	public void user_launches_the_browser_and_navigated_to_url() throws Throwable
	{
	    driver=new FirefoxDriver();
	    driver.get("http://opensource.demo.orangehrmlive.com");
	    driver.manage().window().maximize();
	    
	}

	@When("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable 
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		
	}

	@When("^also clicks on login$")
	public void also_clicks_on_login() throws Throwable
	{
	    driver.findElement(By.id("btnLogin")).click();
	    Sleeper.sleepTightInSeconds(5);
	}

	@Then("^welcome message displyed$")
	public void welcome_message_displyed() throws Throwable
	{
	    String expval="welcome";
	    String actval=driver.findElement(By.partialLinkText("Welcome")).getAttribute("id");
	    Assert.assertEquals(expval, actval);
	}

	@When("^user clicks on welcome admin link$")
	public void user_clicks_on_welcome_admin_link() throws Throwable 
	{
		driver.findElement(By.partialLinkText("Welcome")).click();
	}

	@When("^also clicks on logout link$")
	public void also_clicks_on_logout_link() throws Throwable 
	{
		driver.findElement(By.linkText("Logout")).click();
		Sleeper.sleepTightInSeconds(3);
	}

	@Then("^orangehrm login page displayed$")
	public void orangehrm_login_page_displayed() throws Throwable 
	{
	    String expval="LOGIN";
	    String actval=driver.findElement(By.id("btnLogin")).getAttribute("value");
	    Assert.assertEquals(expval, actval);
	}

}
