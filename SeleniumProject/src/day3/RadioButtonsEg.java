package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonsEg {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.xpath(".//*[@id='SearchForm']/nav"));
		List<WebElement> Radios=block.findElements(By.tagName("input"));
		System.out.println(Radios.size());
		for (int i = 0; i < Radios.size(); i++)
		{
			String rText=Radios.get(i).getAttribute("value");
			if (rText.equalsIgnoreCase("MultiCity"))
			{
				Radios.get(i).click();
				break;
			}
		}

	}

}
