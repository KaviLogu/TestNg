package com.Automation_Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Project_Color {

	public WebDriver driver;

	public Project_Color(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "layered_id_attribute_group_13")
	public WebElement colour;

	public WebElement getColour() {
		return colour;
	}

}
