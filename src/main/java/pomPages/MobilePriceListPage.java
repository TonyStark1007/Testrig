package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobilePriceListPage {
@FindBy(xpath="(//div[@class='_4rR01T'])[2]")
private WebElement mobileselection;
public MobilePriceListPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void mobileselection() {
	mobileselection.click();
}
}
