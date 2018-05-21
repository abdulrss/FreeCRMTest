package com.crm.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.crm.qa.pages.LogInPage;
import com.crm.qa.testbase.TestBase;

public class NewTest extends TestBase{

	//Defining elements
	  
	  @FindBy(name="username") public static WebElement username;
	  @FindBy(name="password") public static WebElement password;
		
	  @FindBy(xpath="input[@type='submit']") public static WebElement submitBtn;
	
  @Test
  public void launchFreeCRM() throws InterruptedException {
	  
	  //Initilizing browser
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Automation Test\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  
	  
	  //Launch FreeCRM
	  driver.get("https://www.freecrm.com");
	  
	//wait for results page to load, 
	   Thread.sleep(5000);
	  username.click();
	  username.sendKeys("abdulrss");
	  password.sendKeys("abdulrss");
	  submitBtn.click();
	 
  }
}
