package seleniumdemo2;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.training.listeners.*;

public class RetryDemo {

    @Test(retryAnalyzer = Retry.class)
    public void failedTest() {

        System.out.println("Executing Test");

        Assert.assertTrue(false);
    }
}
