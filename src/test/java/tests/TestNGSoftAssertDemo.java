package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGSoftAssertDemo {

    @Test
    public void verifyDetails() {

        SoftAssert soft = new SoftAssert();

        System.out.println("Step 1");

        soft.assertEquals("Google", "Yahoo");

        System.out.println("Step 2");

        soft.assertTrue(false);

        System.out.println("Step 3");

        soft.assertAll();
    }
}