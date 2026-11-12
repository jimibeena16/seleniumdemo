package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.DriverFactory;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = DriverFactory.getDriver();

	        driver.manage().window().maximize();
	        driver.get("https://demoqa.com/alerts");

	        driver.findElement(By.id("promtButton")).click();

	        Alert alert = driver.switchTo().alert();
	        alert.sendKeys("Hello");
	        alert.accept();

	        String result = driver.findElement(By.id("promptResult")).getText();
	        System.out.println(result);


	driver.quit();
	
	}

}
