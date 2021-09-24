package com.Automation_Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Project_Signout {
	
	public WebDriver driver;

	public Project_Signout(WebDriver driver2) {

		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='logout']")
	private WebElement signout;

	public WebElement getSignout() {
		return signout;
	}
	

}
