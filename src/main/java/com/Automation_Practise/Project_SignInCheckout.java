package com.Automation_Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Project_SignInCheckout {

	public WebDriver driver;

	public Project_SignInCheckout(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Proceed to checkout']")
	public WebElement checkout1;

	public WebElement getCheckout1() {
		return checkout1;
	}

}
