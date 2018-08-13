package pageObjectsRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsDetailPageRepo {
	
	@FindBy( className = "quantity_input")
	public static WebElement quantity;
	
	@FindBy( id = "productPageAdd2Cart")
	public static WebElement AddToProductButton;
	
	
	@FindBy( id = "minishopcart_total")
	public static WebElement minishopcart_total;
	
	@FindBy( id = "cart_text")
	public static WebElement cart_text;
	
	@FindBy( id = "GotoCartButton2")
	public static WebElement GotoCartButton;
	
	

}
