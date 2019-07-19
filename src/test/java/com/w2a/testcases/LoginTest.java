package com.w2a.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class LoginTest extends TestBase{
	
	@Test
	public void loginAsBackManager() throws InterruptedException {
		driver.findElement(By.cssSelector(OR.getProperty("bankManagerLoginButton"))).click();
		Thread.sleep(3000);
	}
}
