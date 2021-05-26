package Scripts;

import java.io.FileNotFoundException;
import java.io.IOException;


import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AsusRogPhone5Page;
import pomPages.MobilePriceListPage;
import pomPages.MobilesBuyProductsPage;
import pomPages.OnlineShoppingSitePage;
import pomPages.ShoppingCartPage;

public class AddToCart extends BaseClass {
	//By using extends keyword we are inherting the properties and behaviour
	//it will inhert the @BeforeMethod and @AfterMethod 
	//@BeforeMethod will execute First Before @Test
	//@BeforeMethod it will open the broswer enter the url it will wait until page get load
	
	@Test   //Execution of program will start from @Test
	public void removeProduct() throws FileNotFoundException, IOException {
		
		//here we create object of OnlineShoppingSitePage to access the methods of that class
		OnlineShoppingSitePage o=new OnlineShoppingSitePage(driver);
		o.loginpopup();
		o.searchbtn(p.getData("search"));
		o.searchbtnclick();
		
		//here we create object of MobilesBuyProductsPage to access the methods of that class
		MobilesBuyProductsPage m=new MobilesBuyProductsPage(driver);
		utilties.mouseHover(driver, m.getElectronicsbtn());
		m.mobilebrandsbtn();
		
		//here we create object of OnlineShoppingSitePage to access the methods of that class
		MobilePriceListPage list=new MobilePriceListPage(driver);
		list.mobileselection();
		utilties.switchTab(driver);
		
		//here we create object of AsusRogPhone5Page to access the methods of that class
		AsusRogPhone5Page a=new AsusRogPhone5Page(driver);
		a.colourSelection();
		a.storageSelection();
		a.addToCart();
		
		//here we create object of ShoppingCartPage to access the methods of that class
		ShoppingCartPage s=new ShoppingCartPage(driver);
		s.mobilename();
		s.price();
		s.removeBtn();
		s.finalremove();	
	}
	//@AfterMethod will get executed after the @Test method get executed
	//it will check the status if it is failes it take Screenshot and if status is pass it close the app
}
