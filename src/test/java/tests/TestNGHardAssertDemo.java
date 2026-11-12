package tests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGHardAssertDemo {

    @Test
    public void verifyTitle() {

        String actualTitle = "Google";
        String expectedTitle = "Yahoo";

        Assert.assertEquals(actualTitle, expectedTitle);

        System.out.println("This line will NOT execute");
    }
}