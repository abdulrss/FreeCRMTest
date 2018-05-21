package com.crm.qa.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase() {
		
		try {
			
		prop = new Properties();
		//FileInputStream ip = new FileInputStream("C:/Automation Test/GitHubFreeCRMTest/src/main/java/com/crm/qa/config/config.properties");
		FileInputStream ip = new FileInputStream("C:\\Automation Test\\GitHub\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
		
		
		prop.load(ip);
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chromedriver", "C:\\Users\\abdul\\Downloads\\chromedriver");
			driver = new ChromeDriver();
			}
		else if (browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\abdul\\Downloads\\geckodriver");
			driver = new FirefoxDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGELOAD_MAX_TIME_OUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}
	
	
	

}
