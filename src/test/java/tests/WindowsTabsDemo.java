package tests;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.DriverFactory;

public class WindowsTabsDemo {

    public static void main(String[] args) {

       WebDriver driver = DriverFactory.getDriver();

        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");

        String parentWindow = driver.getWindowHandle();

        driver.findElement(By.id("tabButton")).click();

        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
                System.out.println("Child window text: " + driver.findElement(By.id("sampleHeading")).getText());
                driver.close();
            }
        }

        driver.switchTo().window(parentWindow);

        System.out.println("Back to parent window");

        driver.quit();
    }
}
