package genericLib;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WedDriverUtilities {
	public void mouseHover(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	public void alertPopup(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	public void switchTab(WebDriver driver) {
		Set<String> ele = driver.getWindowHandles();
		for (String b : ele) {
			driver.switchTo().window(b);
		}
}
	}
