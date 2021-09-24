package com.Automation_Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Project_AddToCart {

	public WebDriver driver;

	public Project_AddToCart(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//span[text()='Add to cart']")
	public WebElement addtocart;

	public WebElement getAddtocart() {
		return addtocart;
	}


}
