package com.Automation_Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresses_Project {

	private WebDriver driver;

	public Dresses_Project(WebDriver driver2) {

		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[text()='Dresses'])[2]")
	public WebElement dresses;

	public WebElement getDresses() {
		return dresses;
	}
	
		
	

}
