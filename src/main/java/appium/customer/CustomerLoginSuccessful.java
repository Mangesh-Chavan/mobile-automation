package appium.customer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import appium.configuration.TestConfig;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class CustomerLoginSuccessful extends TestConfig {
	private static AndroidDriver driver;
	
	@Test
	public void test_01LoginPage() {
		driver = getDriver();
		Actions a = new Actions(driver);
		driver.findElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Sign in')]")).isDisplayed();
	}
	
	@Test
	public void test_02AfterLoginPage() {
		
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[contains(@hint,'Email ID')]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[contains(@hint,'Email ID')]")).sendKeys("ant.llp2022@gmail.com");
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[contains(@hint,'Password')]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[contains(@hint,'Password')]")).sendKeys("Ant*123");
		driver.findElement(AppiumBy.xpath("//android.widget.Button[contains(@content-desc,'LOGIN')]")).click();
		driver.findElement(AppiumBy.xpath("//android.view.View[bounds='[140,1859][203,1922]']")).click();
	}
}
