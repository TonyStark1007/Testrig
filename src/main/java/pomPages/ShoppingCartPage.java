package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;


public class ShoppingCartPage {
	@FindBy(xpath="//a[@class='_2Kn22P gBNbID']")
	private WebElement mobilename;
	@FindBy(xpath="//span[@class='_2-ut7f _1WpvJ7']")
	private WebElement price;
	@FindBy(xpath="//div[text()='Remove']")
	private WebElement removebtn;
	@FindBy(xpath="//div[text()='Remove']")
	private WebElement finalremove;
	public ShoppingCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void mobilename() {
	Reporter.log("Mobile Name: "+ mobilename.getText(), true);	
	}

	public void price() {
		Reporter.log("Mobile Price: "+price.getText(), true);
	}
	
	public void removeBtn() {
		removebtn.click();
	}
	public void finalremove() {
		finalremove.click();
	}


}
