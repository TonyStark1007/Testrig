package genericLib;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot implements AutoConstants {
	public String takeScreenshot(WebDriver driver,String name) throws IOException {
		Date d=new Date();
		String date = d.toString().replace("-", ":");
		TakesScreenshot s=(TakesScreenshot) driver;
		File src = s.getScreenshotAs(OutputType.FILE);
		File dest=new File(Screenshotpath+date+name+".png");
		FileUtils.copyFile(src, dest);
		return date;

	}
}
