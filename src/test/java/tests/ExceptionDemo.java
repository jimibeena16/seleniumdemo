package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.DriverFactory;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = DriverFactory.getDriver();

	        try {

	             driver.get("https://www.saucedemo.com/");

	             driver.findElement(By.id("wrong-username")).sendKeys("standard_user");

	         } catch (Exception e) {

	           System.out.println("Error: " + e.getMessage());

	         } finally {

	            System.out.println("Browser closed");
	            driver.quit();

	         }
	     }

	}


