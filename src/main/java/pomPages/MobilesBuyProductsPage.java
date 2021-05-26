package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobilesBuyProductsPage {
	@FindBy(xpath="//span[text()='Electronics']")
	private WebElement electronicsbtn;
	@FindBy(xpath="//a[text()='Asus']")
	private WebElement mobilebrandsbtn;
	public MobilesBuyProductsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getElectronicsbtn() {
		return electronicsbtn;
	}
	public  void mobilebrandsbtn() {
		mobilebrandsbtn.click();
	}
	
}
