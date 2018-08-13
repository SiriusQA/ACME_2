package pageObjectsRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomepageRepo {
	
	@FindBy(id = "searchTerm")
	public static WebElement searchTextbox;
	
	@FindBy(id = "search_submit")
	public static WebElement searchSubmit;

}
