package Testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import listeners.TestListener;

/*import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;*/

import pageObjectsRepo.CatgoryPageRepo;
import pageObjectsRepo.HomepageRepo;
import pageObjectsRepo.ProductsDetailPageRepo;
import pageObjectsRepo.ShoppingCartPageRepo;


public class BaseTest extends TestListener {
	public WebDriver driver;
	HomepageRepo homepage;
	CatgoryPageRepo categorypage;
	ProductsDetailPageRepo productsDetailPage;
	ShoppingCartPageRepo shoppingCartPageRepo;
	



	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "/Users/indhul/Documents/ChromeDriver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.acmetools.com/");
		homepage = PageFactory.initElements(driver, HomepageRepo.class);
		categorypage = PageFactory.initElements(driver, CatgoryPageRepo.class);
		productsDetailPage = PageFactory.initElements(driver, ProductsDetailPageRepo.class);
		shoppingCartPageRepo = PageFactory.initElements(driver, ShoppingCartPageRepo.class);
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Script completed");
		driver.quit();
	}
	
public static String captureScreen(WebDriver driver, String screenName) throws IOException{
		
		TakesScreenshot screen = (TakesScreenshot) driver;
		File src = screen.getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir")+"//Test-ScreenShots//"+screenName+".png";
		File target = new File(dest);
		FileUtils.copyFile(src, target);	
		return dest;
	}

}
