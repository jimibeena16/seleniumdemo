package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import utilities.DriverFactory;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	WebDriver driver = new ChromeDriver();
		WebDriver driver = DriverFactory.getDriver();
			 driver.manage().window().maximize();
			
			driver.get("https://demoqa.com/select-menu");
			
			Select select = new Select(driver.findElement(By.id("oldSelectMenu")));
			//Select by visible text
			//select.selectByVisibleText("Green");
			//By value
			//select.selectByValue("2");
			//By index
			select.selectByIndex(2);
			//Get selected value
			System.out.println(select.getFirstSelectedOption().getText());

	 driver.quit();
	}

}
