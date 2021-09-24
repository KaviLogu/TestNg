package com.Automation_Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn_Page {

	public SignIn_Page(WebDriver driver2 ) {
		
this.driver = driver2;

PageFactory.initElements(driver, this);
	}

public WebDriver driver;

@FindBy(xpath = "//input[@id='email']")
private WebElement username;

public WebElement getUsername() {
	return username;
}

@FindBy(xpath = "//input[@id='passwd']")
private WebElement password;

public WebElement getPassword() {
	return password;
}

@FindBy(xpath = "//i[@class='icon-lock left']")
private WebElement signIn;

public WebElement getSignIn() {
	return signIn;
}






		
	}


