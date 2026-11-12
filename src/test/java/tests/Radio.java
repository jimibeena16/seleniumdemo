package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();

		 driver.get("https://demoqa.com/radio-button");
		WebElement yesRadio = driver.findElement(By.xpath("//input[@id='yesRadio']"));
		yesRadio.click();
		
		Thread.sleep(3000);
		System.out.println(yesRadio.isSelected());

	//WebElement radio = driver.findElement(By.id("yesRadio"));
		//System.out.println(radio.isSelected());
		
		driver.quit();

	}

}
