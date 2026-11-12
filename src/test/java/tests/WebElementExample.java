package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/text-box");
		
		WebElement name = driver.findElement(By.id("userName"));
		name.sendKeys("John");
		name.clear();
		name.sendKeys("David");

		//Get text
		/*String text = driver.findElement(By.id("name")).getText();
		System.out.println(text);

		//Attribute
		String value1 = driver.findElement(By.id("userName")).getAttribute("value"); */


		//Validation
		System.out.println(driver.findElement(By.id("userName")).isDisplayed());
		System.out.println(driver.findElement(By.id("userName")).isEnabled());
		System.out.println(driver.findElement(By.id("userName")).isSelected()); //false

		driver.quit();

	}

}
