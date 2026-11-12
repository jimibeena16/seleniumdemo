package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();

	        driver.manage().window().maximize();
	        driver.get("https://demoqa.com/text-box");

	        // 1. Absolute XPath
	        // /html/body/div/div/div/div/div/div/form/div/input

	        // 2. Relative XPath
	        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Jimi");

	        // 3. XPath using attribute
	        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("jimi@test.com");

	        // 4. contains()
	        driver.findElement(By.xpath("//textarea[contains(@id,'current')]")).sendKeys("Kochi");

	        // 5. starts-with()
	        driver.findElement(By.xpath("//input[starts-with(@id,'userN')]"));

	        // 6. XPath with text()
	        String heading = driver.findElement(By.xpath("//h1[text()='Text Box']")).getText();

	        System.out.println(heading);

	        driver.quit();

	}

}
