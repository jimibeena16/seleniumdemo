package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Errormessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();

	        driver.get("https://www.saucedemo.com/");

	        driver.findElement(By.id("user-name")).sendKeys("wronguser");
	        driver.findElement(By.id("password")).sendKeys("wrongpassword");
	        driver.findElement(By.id("login-button")).click();

	        String actualError = driver.findElement(By.cssSelector("h3[data-test='error']")).getText();
	        String expectedError = "Epic sadface: Username and password do not match any user in this service";

	        if(actualError.equals(expectedError))
	        {
	            System.out.println("Error message verified");
	        }
	        else
	        {
	            System.out.println("Verification failed");
	        }

	        driver.quit();

	}

}
