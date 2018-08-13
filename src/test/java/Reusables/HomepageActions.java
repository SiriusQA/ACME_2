package Reusables;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import pageObjectsRepo.HomepageRepo;


public class HomepageActions {

	WebDriver driver;


	public static void searchTerm(String string) {
		HomepageRepo.searchTextbox.sendKeys("hammer");
		System.out.println("Text entered in the searchbox");
		HomepageRepo.searchSubmit.click();

	}
	
	

}
