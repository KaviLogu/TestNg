package com.Automation_Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoptPage_Project {

	public WebDriver driver;

	public CheckoptPage_Project(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Proceed to checkout']")
	public WebElement checkout;

	public WebElement getCheckout() {
		return checkout;
	}

}
