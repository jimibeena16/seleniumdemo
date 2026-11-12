package com.training.tests;
import utilities.DriverFactory;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.training.pages.*;

public class LoginTest extends BaseTest {
	
 @Test(groups={"smoke","regression"}, description="Valid login")
 public void validLogin(){
	 
	 driver.get("https://www.saucedemo.com/");
	  
     LoginPage loginPage = new LoginPage(driver);

     loginPage.login("standard_user","secret_sauce");
  
  Assert.assertTrue(new ProductsPage(driver).isDisplayed());

 }
 
     }

