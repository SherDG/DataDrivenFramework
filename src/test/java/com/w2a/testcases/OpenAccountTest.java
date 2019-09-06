package com.w2a.testcases;

import java.util.Hashtable;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;
import com.w2a.utilities.TestUtil;

public class OpenAccountTest extends TestBase{
	
	@Test(dataProviderClass = TestUtil.class, dataProvider = "dp")
	public void OpenAccountTest(Hashtable<String,String> data) throws InterruptedException {	
//	public void OpenAccountTest(String customer, String currency) throws InterruptedException {	
	
		
		if(!TestUtil.isTestRunnable("OpenAccountTest", excel)) {
			throw new SkipException("Skip test" + "OpenAccountTest".toUpperCase()+"because of the runmode - NO");
		}
		
		click("openAccountButton_CSS");
//		Thread.sleep(3000);
		select("customerName_CSS", data.get("customer"));
		select("currency_CSS", data.get("currency"));		
//		select("customerName_CSS", customer);
//		select("currency_CSS", currency);		
		click("processButton_CSS");			
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());		
		alert.accept();
		
	}		
}
