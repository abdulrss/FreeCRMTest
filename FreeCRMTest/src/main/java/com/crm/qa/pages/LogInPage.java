package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.testbase.TestBase;

public class LogInPage extends TestBase{

	//Page Factory - OR
	
	@FindBy(name="username") WebElement username;
	@FindBy(name="password") WebElement password;
	
	@FindBy(xpath="input[@type='submit']") WebElement submitBtn;
	
	
	//Below is the page constructor for class LogInPage which is used to initialise all the elements in this class
	public LogInPage() {
		
		PageFactory.initElements(driver, this); //this is the method to initialise all the web elements defined in this' class
		
	}
	
}
