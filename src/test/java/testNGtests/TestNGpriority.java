package testNGtests;

import org.testng.annotations.Test;

public class TestNGpriority {

    @Test(priority = 1)
    public void launchBrowser() {
        System.out.println("Launch Browser");
    }

    @Test(priority = 2)
    public void login() {
        System.out.println("Login");
    }

    @Test(priority = 3)
    public void searchProduct() {
        System.out.println("Search Product");
    }

    @Test(priority = 0)
    public void logout() {
        System.out.println("Logout");
    }
}