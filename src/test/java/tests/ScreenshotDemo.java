package tests;


import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.DriverFactory;

public class ScreenshotDemo {
@Test
public void loginTest() throws Exception {
	
	WebDriver driver = DriverFactory.getDriver();
	 driver.manage().window().maximize();

    driver.get("https://demoqa.com");

     // Screenshot code here
    TakesScreenshot ts = (TakesScreenshot) driver;
    File src = ts.getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(src, new File("./Screenshots/loginTest.png"));
    
    Assert.assertEquals(driver.getTitle(), "Wrong Title");
}
}
