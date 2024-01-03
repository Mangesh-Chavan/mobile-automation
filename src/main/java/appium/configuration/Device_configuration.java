package appium.configuration;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Device_configuration {
//	public static WebDriver setDriverConfigure() throws MalformedURLException {
//
////			DesiredCapabilities dc = new DesiredCapabilities()
////					.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
//	UiAutomator2Options options = new UiAutomator2Options()
//		    .setAvd("emulator-5554")
//		    .setApp("C:\\Users\\DELL\\AppData\\Local\\Android\\Sdk\\platform-tools\\customer.apk")
//			.setAppPackage("ant.marketPlace.customer")
//			.setAppActivity("ant.marketPlace.customer.MainActivity");
//	URL url = new URL("http://127.0.0.1:4723");
//	AndroidDriver driver = new AndroidDriver(
//		    // The default URL in Appium 1 is http://127.0.0.1:4723/wd/hub
//		    url, options
//		);
//		try {
//		    WebElement el = driver.findElement(AppiumBy.xpath("//button"));
//		    el.click();
//		    driver.getPageSource();
//		} finally {
//		    driver.quit();
//		}
//}
	
	private static AndroidDriver driver;

	  public static AndroidDriver setUp(String appName, String packageName, String activityName) throws MalformedURLException {
	    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("appium:deviceName", "emulator-5556");
	    desiredCapabilities.setCapability("appium:automationName", "uiautomator2");
	    desiredCapabilities.setCapability("appium:app", "C:\\Users\\DELL\\AppData\\Local\\Android\\Sdk\\platform-tools\\" +appName);
	    desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
	    desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
	    desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
	    desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);
	    desiredCapabilities.setCapability("appPackage", packageName);
	    desiredCapabilities.setCapability("appActivity", activityName);
	    URL remoteUrl = new URL("http://127.0.0.1:4723");

	    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
	    
	    return driver;
	  }
	}
