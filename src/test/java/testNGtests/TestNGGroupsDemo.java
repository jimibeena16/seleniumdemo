package testNGtests;

import org.testng.annotations.Test;

public class TestNGGroupsDemo {

    @Test(groups = {"smoke"})
    public void loginTest() {
        System.out.println("Smoke - Login");
    }

    @Test(groups = {"regression"})
    public void paymentTest() {
        System.out.println("Regression - Payment");
    }

    @Test(groups = {"smoke", "regression"})
    public void logoutTest() {
        System.out.println("Smoke + Regression - Logout");
    }
}

