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
	@Test
	public void removeProduct() throws FileNotFoundException, IOException {
		OnlineShoppingSitePage o=new OnlineShoppingSitePage(driver);
		o.loginpopup();
		o.searchbtn(p.getData("search"));
		o.searchbtnclick();
		MobilesBuyProductsPage m=new MobilesBuyProductsPage(driver);
		utilties.mouseHover(driver, m.getElectronicsbtn());
		m.mobilebrandsbtn();
		MobilePriceListPage list=new MobilePriceListPage(driver);
		list.mobileselection();
		utilties.switchTab(driver);
		AsusRogPhone5Page a=new AsusRogPhone5Page(driver);
		a.colourSelection();
		a.storageSelection();
		a.addToCart();
		ShoppingCartPage s=new ShoppingCartPage(driver);
		s.mobilename();
		s.price();
		s.removeBtn();
		s.finalremove();


	}
}
