package Reusables;

import org.openqa.selenium.WebDriver;

import pageObjectsRepo.CatgoryPageRepo;


public class CategorypageActions {

	WebDriver driver;


	public static void selectProduct() throws InterruptedException {
		Thread.sleep(3000);
		CatgoryPageRepo.FirstProduct.click();

	}


	public WebDriver getDriver() {
		return driver;
	}


	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	

}
