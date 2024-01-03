package appium.configuration;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;



public class TestConfig {
	
public static AndroidDriver driver;
	
	@BeforeTest
	public AndroidDriver init() throws MalformedURLException
	{
		//System.setProperty("webdriver.chrome.driver", "D:\\Navneet\\Eclipse-Projects\\selenium\\src\\main\\resources\\chromedriver.exe");
		driver = Device_configuration.setUp("customer.apk","ant.marketPlace.customer","ant.marketPlace.customer.MainActivity");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		return driver;
	}
	
	//@AfterMethod
	public void Screenshot() throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File SrcFile =screenshot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File("C://Users//DELL//Eclipse-Projects//selenium//src//main//resources//screenshots");
		FileUtils.copyFile(SrcFile, DestFile);
		System.out.println("Inside Screenshot");
		
	}
	
	public static AndroidDriver getDriver() {
		return driver;
	}
	
	
	//@AfterTest
	public void destroy() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

}
