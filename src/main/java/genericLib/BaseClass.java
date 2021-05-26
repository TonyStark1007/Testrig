package genericLib;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

public class BaseClass extends PropertyFile {
	public WebDriver driver;
	public WedDriverUtilities utilties=new WedDriverUtilities();
	public PropertyFile p=new PropertyFile();
	public SoftAssert s=new SoftAssert();
	@BeforeMethod   
	public void openApp() throws FileNotFoundException, IOException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(p.getData("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closeApp(ITestResult r) throws IOException {
		
		int status = r.getStatus();
		 String name = r.getName();
		 if(status==2) {
			Screenshot  s=new Screenshot();
			s.takeScreenshot(driver, name);	
		 }
		 driver.quit();
	}
}
