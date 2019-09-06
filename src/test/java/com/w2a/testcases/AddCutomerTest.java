package com.w2a.testcases;

import java.util.Hashtable;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;
import com.w2a.utilities.TestUtil;

public class AddCutomerTest extends TestBase{

	
//	@Test(dataProvider="getData")
	
	@Test(dataProviderClass=TestUtil.class, dataProvider="dp")
	public void addCustomerTest(Hashtable<String,String> data) throws InterruptedException{
//	public void addCustomerTest(String firstName, String lastName, String postcode, String alerttext, String runmode) throws InterruptedException {
//		driver.findElement(By.cssSelector(OR.getProperty("addCustomerButton"))).click();
//		driver.findElement(By.cssSelector(OR.getProperty("firstname"))).sendKeys(firstName);
//		driver.findElement(By.cssSelector(OR.getProperty("lastname"))).sendKeys(lastName);
//		driver.findElement(By.cssSelector(OR.getProperty("postcode"))).sendKeys(postcode);
//		driver.findElement(By.cssSelector(OR.getProperty("addCustomer"))).click();
		
//		if(!runmode.equals("Y")){
		if(!data.get("runmode").equals("Y")){
			
			throw new SkipException("Skipping the test case as the Run mode for data set is NO");
		}	
		
		click("addCustomerButton_CSS");
		type("firstname_CSS", data.get("firstname"));
		type("lastname_CSS", data.get("lastname"));
		type("postcode_CSS", data.get("postcode"));
		click("addCustomer_CSS");
//		type("firstname_CSS", firstName);
//		type("lastname_CSS", lastName);
//		type("postcode_CSS", postcode);		
	
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());		
//		Assert.assertTrue(alert.getText().contains(alerttext));
		Assert.assertTrue(alert.getText().contains(data.get("alerttext")));
		alert.accept();
//		Thread.sleep(1000);
		Reporter.log("Customer was added!");
	}
	
//	@DataProvider
//	public Object[][] getData(){
//		String sheetName ="AddCustomerTest"; 
//		int rows = excel.getRowCount(sheetName);
//		int cols = excel.getColumnCount(sheetName);
//		
//		Object[][] data = new  Object[rows-1][cols];	
//		for (int rowNum=2; rowNum<=rows; rowNum++){
//			for (int colNum = 0; colNum <cols; colNum++){
//				data[rowNum-2][colNum]=excel.getCellData(sheetName, colNum, rowNum);
//			}
//		}
//		return data;
//	}
		
}
