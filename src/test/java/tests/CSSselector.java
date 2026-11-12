package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver driver = new ChromeDriver();

	        driver.manage().window().maximize();
	        
	        driver.get("https://demoqa.com/text-box");
		// CSS using ID
        driver.findElement(By.cssSelector("#userName")).sendKeys("Jimi");

        // CSS using attribute
        driver.findElement(By.cssSelector("input[type='email']")).sendKeys("jimi@test.com");

         //(By.xpath("//input[@type='email']"))

        // CSS using tag + ID
        driver.findElement(By.cssSelector("textarea#currentAddress")).sendKeys("Kochi");

        // CSS using starts-with
        driver.findElement(By.cssSelector("input[id^='user']"));

        // CSS using contains
        driver.findElement(By.cssSelector("textarea[id*='Address']"));
        
        System.out.println("Form filled successfully");

        driver.quit();

	}

}
