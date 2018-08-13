package Testcases;

import org.testng.ITestResult;
import org.testng.annotations.Test;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Reusables.*;

public class HomepageScripts_1 extends BaseTest {
	
/*	@Test
	public void SearchProduct() {
//		ExtentTest extentTest = extent.createTest("SearchProduct" , "SearchProduct");
//		extentTest.log(Status.INFO, "SearchProduct");
		System.out.println("********");
		HomepageActions.searchTerm("string");
	}*/

	@Test
	public void SearchCheckout() throws Exception {
		ExtentTest extentTest = extent.createTest("SearchProduct" , "To verify guest user able to add product using search");
		extentTest.log(Status.PASS, "SearchProduct");
		String screenShot = captureScreen(driver, "suresh");
		extentTest.pass("Screen Shot : " + extentTest.addScreenCaptureFromPath(screenShot));
		//HomepageActions.searchTerm(LoginName);
		HomepageActions.searchTerm("hammer");
		extentTest.log(Status.PASS, "Search term entered");
		String screenShot1 = captureScreen(driver, "suresh1");
		extentTest.pass("Screen Shot : " + extentTest.addScreenCaptureFromPath(screenShot1));
		extentTest.pass("Screen Shot : " + extentTest.addScreencastFromPath(screenShot1));
		CategorypageActions.selectProduct();
		extentTest.log(Status.PASS, "Product Selected in the CLP");
		ProductsDetailPageActions.quantity("5");
		extentTest.log(Status.PASS, "Qty increased in PDP");
		ProductsDetailPageActions.AddToCart();
		extentTest.log(Status.PASS, "Product added to the cart");
		ProductsDetailPageActions.minishopcart_total();
	}
	
	@Test
	public void SearchCheckout1() throws InterruptedException {
		ExtentTest extentTest = extent.createTest("SearchProduct_second" , "Search checkout Scenario");
		extentTest.log(Status.PASS, "SearchProduct");
		System.out.println("********");
		HomepageActions.searchTerm("hammer");
		extentTest.log(Status.PASS, "Search term entered");
		CategorypageActions.selectProduct();
		extentTest.log(Status.PASS, "Search term entered");
		ProductsDetailPageActions.quantity("5");
		extentTest.log(Status.PASS, "Search term entered");
		ProductsDetailPageActions.AddToCart();
		extentTest.log(Status.PASS, "Search term entered");
		//ProductsDetailPageActions.minishopcart_total();
	}
}
