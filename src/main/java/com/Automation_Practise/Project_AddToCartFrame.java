package com.Automation_Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Project_AddToCartFrame {

	public WebDriver driver;

	public Project_AddToCartFrame(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//div[@class='product-container']")
	public WebElement addtocartframe;

	public WebElement getAddtocartframe() {
		return addtocartframe;
	}
	
}
