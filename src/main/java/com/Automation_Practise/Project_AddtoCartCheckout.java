package com.Automation_Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Project_AddtoCartCheckout {

	public WebDriver driver;

	public Project_AddtoCartCheckout(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span)[31]")
	public WebElement proceedtocheckout;

	public WebElement getProceedtocheckout() {
		return proceedtocheckout;
	}

}
