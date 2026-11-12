package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import utilities.DriverFactory;

public class ScrollingDemo {

    public static void main(String[] args) throws InterruptedException {

       WebDriver driver = DriverFactory.getDriver();

        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");

    //  WebElement element1 = driver.findElement(By.id("submit"));
           
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement submit = driver.findElement(By.id("submit"));

        // Scroll to particular element
        js.executeScript("arguments[0].scrollIntoView(true);",submit);
       
        Thread.sleep(5000);
        System.out.println("Test passed successfully");

        driver.quit();
    }
}
