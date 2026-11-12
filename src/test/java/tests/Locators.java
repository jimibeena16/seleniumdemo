package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriver driver = new ChromeDriver();

	        driver.manage().window().maximize();
	        driver.get("https://demoqa.com/text-box");

	        // 1. ID
	        WebElement userName = driver.findElement(By.id("userName")); //*[@id='userName'] or #userName
	        userName.sendKeys("Jimi");

	        // 2. Name
	        // Generic example:
	        // driver.findElement(By.name("username"));

	        // 3. Class Name
	        WebElement form = driver.findElement(By.className("form-control")); //first matching element
	        System.out.println("Class Name element: " + form.getAttribute("id"));


	//To get 2nd or 3rd, use list
	//List<WebElement> formFields = driver.findelements(By.className("form-control"));
	//WebElement userNameField = formFields.get(0);

	        // 4. Tag Name
	        WebElement heading = driver.findElement(By.tagName("h1"));
	        System.out.println("Heading: " + heading.getText());

	        // 5. CSS Selector
	        driver.findElement(By.cssSelector("#userEmail")).sendKeys("jimi@test.com");

	        // 6. XPath
	        driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Kochi, Kerala");
	        //@placeholder


	        driver.quit();

	}

}
