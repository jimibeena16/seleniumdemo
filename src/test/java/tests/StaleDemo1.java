package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleDemo1 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        WebElement username = driver.findElement(By.id("user-name"));

        // Refresh page
        driver.navigate().refresh();

        try {
            username.sendKeys("standard_user");
        }
        catch (StaleElementReferenceException e) {

            System.out.println("Element became stale");

            username = driver.findElement(By.id("user-name"));
            username.sendKeys("standard_user");
        }

        driver.quit();
    }
}

