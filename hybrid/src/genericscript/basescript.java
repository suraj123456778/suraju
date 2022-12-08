package genericscript;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class basescript implements framework_constant {
	
	public WebDriver driver;
	@BeforeMethod
	public void openApp()
	{
		System.setProperty(geckokey,geckovalue);
		 driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(url);
	}
		@AfterMethod
		public void closeapp(ITestResult result) throws IOException
		{
			
			if(ITestResult.FAILURE==result.getStatus()) {
				Screenshot.getPhoto(driver);
				
			}
				driver.close();
		}
	}
	


