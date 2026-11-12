package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();

		  driver.get("https://demoqa.com/checkbox");
		  driver.findElement(By.xpath("//span[contains(@class,'rc-tree-switcher')]")).click();
		  
		  WebElement checkbox = driver.findElement(By.xpath("//span[@aria-label='Select Downloads']"));
		  checkbox.click();
		  		    	 
		  Thread.sleep(3000);
		  String result = driver.findElement(By.id("result")).getText();
		  if(result.contains("downloads")) {
		  		             System.out.println("Downloads selected");
		  		         } else {
		  		             System.out.println("Downloads not selected");
		  		         }
		                driver.quit();
	}

}
