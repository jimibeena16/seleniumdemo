package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousedemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);

        // =====================================================
        // 1. MOUSE HOVER
        // =====================================================

        driver.get("https://demoqa.com/menu");

        WebElement mainItem2 = driver.findElement(By.xpath("//a[text()='Main Item 2']"));

        actions.moveToElement(mainItem2).perform();

        System.out.println("Mouse Hover Completed");

        Thread.sleep(3000);


        // =====================================================
        // 2. ACTIONS CLICK
        // =====================================================

        driver.get("https://demoqa.com/buttons");

        WebElement clickMeBtn = driver.findElement(By.xpath("//button[text()='Click Me']"));

        actions.click(clickMeBtn).perform();

        System.out.println(driver.findElement(By.id("dynamicClickMessage")).getText());

        Thread.sleep(3000);


        // =====================================================
        // 3. DOUBLE CLICK
        // =====================================================

        driver.get("https://demoqa.com/buttons");

        WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));

        actions.doubleClick(doubleClickBtn).perform();

        System.out.println(driver.findElement(By.id("doubleClickMessage")).getText());

        Thread.sleep(3000);


        // =====================================================
        // 4. RIGHT CLICK
        // =====================================================

        driver.get("https://demoqa.com/buttons");

        WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));

        actions.contextClick(rightClickBtn).perform();

        System.out.println(driver.findElement(By.id("rightClickMessage")).getText());

        Thread.sleep(3000);


        // =====================================================
        // 5. DRAG AND DROP
        // =====================================================

        driver.get("https://demoqa.com/droppable");

        WebElement source = driver.findElement(By.id("draggable"));

        WebElement target = driver.findElement(By.id("droppable"));

        actions.dragAndDrop(source, target).perform();

        System.out.println("Drag And Drop Completed");

        Thread.sleep(3000);


        // =====================================================
        // 6. DRAG AND DROP USING CLICK AND HOLD IF NORMAL DRAG & DROP IS UNRELIABLE
        // =====================================================

        driver.navigate().refresh();

        source = driver.findElement(By.id("draggable"));
        target = driver.findElement(By.id("droppable"));

        actions.clickAndHold(source)
               .moveToElement(target)
               .release()
               .perform();

        System.out.println("Click-And-Hold Drag Drop Completed");

        Thread.sleep(3000);

        driver.quit();
    }
}