package Reusables;

import pageObjectsRepo.ProductsDetailPageRepo;

public class ProductsDetailPageActions {

	public static void quantity(String qty) throws InterruptedException {
		Thread.sleep(2000);
		ProductsDetailPageRepo.quantity.clear();
		ProductsDetailPageRepo.quantity.sendKeys(qty);
	}

	public static void AddToCart() throws InterruptedException {
		Thread.sleep(2000);
		ProductsDetailPageRepo.AddToProductButton.click();
	}

	public static void minishopcart_total() throws InterruptedException {
		System.out.println("In minishopcart_total method ");
		Thread.sleep(3000);
		//int cartsize = Integer.parseInt(ProductsDetailPageRepo.minishopcart_total.getText());
//		String cartsize = ProductsDetailPageRepo.minishopcart_total.getText();
//		int cartsizecount = Integer.parseInt(cartsize);
//		System.out.println("Current cartsize is :" +cartsizecount);
//		if (cartsizecount == 5) {
//			System.out.println("valid");
//		}
		ProductsDetailPageRepo.cart_text.click();
		Thread.sleep(1000);
		ProductsDetailPageRepo.GotoCartButton.click();
		
	}

}
