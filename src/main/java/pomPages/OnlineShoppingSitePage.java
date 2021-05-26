package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlineShoppingSitePage {
	@FindBy(xpath="//button[text()='✕']")
	private WebElement loginpopup;
	@FindBy(name="q")
	private WebElement searchtf;

	@FindBy(xpath="//div[text()='Mobiles']")
	private WebElement mobiles;
	@FindBy(xpath="(//li[@class='Y5N33s'])[2]")
	private WebElement suggestion;
	@FindBy(xpath="//button[@class='L0Z3Pu']")
	private WebElement searchbtnclick;
	public OnlineShoppingSitePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void searchbtn(String search) {
		searchtf.sendKeys(search);
	}
	public void mobiles() {
		mobiles.click();
	}
	public void loginpopup() {
		loginpopup.click();
	}
	public void suggestion() {
		suggestion.click();
	}
	public void searchbtnclick() {
		searchbtnclick.click();
	}
}
