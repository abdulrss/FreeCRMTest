package com.crm.qa.testcases;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumTest {
	
	//create instance of Appium driver
	
	AppiumDriver driver;
	
	@BeforeClass
	public void setup() throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "M2HDU18305002992");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		cap.setCapability("appPackage", "com.android.chrome");
		cap.setCapability("appActivity","com.google.android.apps.chrome.ChromeTabbedActivity");
		cap.setCapability(MobileCapabilityType.BROWSER_VERSION, "Version 66.0.3359.158");
		//cap.setCapability("avd", "M2HDU18305002992");
		
		driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		
	}
	
	@Test
	public void simpleMobileTest() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.amazon.co.uk");
		
	}
	
	
	
	

}
