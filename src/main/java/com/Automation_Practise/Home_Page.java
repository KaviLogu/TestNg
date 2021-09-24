package com.Automation_Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//a[contains(text(),'Sign in')]")
	private WebElement signIn_Btn;
	
	public Home_Page(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getSignIn_Btn() {
		return signIn_Btn;
	}
	

	
}
