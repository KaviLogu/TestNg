package com.Automation_Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DressSelectionProject {

	private WebDriver driver;

	public DressSelectionProject(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//p[@class='title_block']")
	public WebElement titleblock;

	public WebElement getTitleblock() {
		return titleblock;
	}

}
