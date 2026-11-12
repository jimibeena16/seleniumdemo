package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();

	        // Maximize browser
	        driver.manage().window().maximize();

	        // Open application
	        driver.get("https://www.saucedemo.com/");

	        // Enter username
	        driver.findElement(By.id("user-name")).sendKeys("standard_user");

	        // Enter password
	        driver.findElement(By.id("password")).sendKeys("secret_sauce");

	        // Click Login button
	        driver.findElement(By.id("login-button")).click();

	        // Validate Login
	        String currentUrl = driver.getCurrentUrl();

	        if(currentUrl.contains("inventory")) {
	            System.out.println("Login Successful");
	        }
	        else {
	            System.out.println("Login Failed");
	        }

	        driver.quit();

	}

}
