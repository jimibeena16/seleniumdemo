package testNGtests;

import org.testng.annotations.Test;

public class TestNGDependency {

    @Test
    public void login() {
        System.out.println("Login Successful");
    }

    @Test(dependsOnMethods = "login")
    public void searchProduct() {
        System.out.println("Searching Product");
    }

    @Test(dependsOnMethods = "searchProduct")
    public void addToCart() {
        System.out.println("Adding Product to Cart");
    }

    @Test(dependsOnMethods = "addToCart")
    public void payment() {
        System.out.println("Making Payment");
    }
}