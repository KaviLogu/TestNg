package com.Automation_Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Project_Size {

	public WebDriver driver;
	
	public Project_Size(WebDriver driver2) {

	this.driver = driver2;
	
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//input[@class='checkbox'])[2]")
	public WebElement size;

	public WebElement getSize() {
		return size;
	}
}
