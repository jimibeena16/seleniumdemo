package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.DriverFactory;

public class ImplicitWaitDemo {

    public static void main(String[] args) {

     WebDriver driver = DriverFactory.getDriver();

        driver.manage().window().maximize();

        // --------------------------
        // IMPLICIT WAIT
        // --------------------------

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoqa.com/dynamic-properties");

        WebElement element1 = driver.findElement(By.id("visibleAfter"));

        System.out.println(element1.getText());

        driver.quit();
    }
}

