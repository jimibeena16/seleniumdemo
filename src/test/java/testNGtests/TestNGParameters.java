package testNGtests;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameters {

    @Parameters({"username", "password"})
    @Test(groups = {"smoke"})
    public void login(
            @Optional("defaultUser") String username,
            @Optional("defaultPass") String password) {

        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}

