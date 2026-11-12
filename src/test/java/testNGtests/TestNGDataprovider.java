package testNGtests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataprovider {

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {

        return new Object[][]{
                {"admin", "admin123"},
                {"user1", "pass123"},
                {"user2", "pass456"}
        };
    }

    @Test(dataProvider = "loginData")
    public void login(String username, String password) {

        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("--------------------");

    }
}