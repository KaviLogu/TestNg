package com.Automation_Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Project_CasualDress {

	public WebDriver driver;

	public Project_CasualDress(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//a[text()='Casual Dresses'])[4]")
	public WebElement casualdress;

	public WebElement getCasualdress() {
		return casualdress;
	}

}
