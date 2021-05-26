package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AsusRogPhone5Page {
@FindBy(xpath="(//div[@class='_2C41yO'])[2]")
private WebElement colourbtn;
@FindBy(xpath="//a[text()='128 GB']")
private WebElement storagebtn;
@FindBy(xpath="//button[text()='ADD TO CART']")
private WebElement addtocartbtn;
public AsusRogPhone5Page(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void colourSelection() {
	colourbtn.click();
}
public void storageSelection(){
	colourbtn.click();
}
public void addToCart(){
	addtocartbtn.click();
}


}
