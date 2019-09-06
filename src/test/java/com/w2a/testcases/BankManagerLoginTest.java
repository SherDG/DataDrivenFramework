package com.w2a.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
//import org.testng.Reporter;
import java.io.IOException;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class BankManagerLoginTest extends TestBase{
	
	@Test
	public void bankManagerLoginTest() throws InterruptedException, IOException{
		
		verifyEquals("abc","xyz");
		Thread.sleep(1000);
//		System.setProperty("org.uncommons.reportng.escape-output", "false"); -- moved to CutomListeners
		LOGGER.debug("Login Test Started");
//		driver.findElement(By.cssSelector(OR.getProperty("bankManagerLoginButton"))).click();
		click("bankManagerLoginButton_CSS");
		Thread.sleep(1000);
		Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addCustomerButton_CSS"))), "Login failed");
//		Reporter.log("Login successful!");
//		Reporter.log("<a target='blank' href='D:\\QA\\TestManagment.png'>Sceehshot</a>");
		LOGGER.debug("Login Test Finished");
		
//		Assert.fail("Login failed!");
	}
}
