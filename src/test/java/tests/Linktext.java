package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();

	        driver.manage().window().maximize();
	        
	        driver.get("https://demoqa.com/links");

	        // Exact link text
	        driver.findElement(By.linkText("Home"));

	        // Partial text
	        driver.findElement(By.partialLinkText("Ho"));

	        System.out.println("Link located successfully");

	        driver.quit();

	}

}
