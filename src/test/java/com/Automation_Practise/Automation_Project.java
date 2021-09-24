package com.Automation_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import FileHelpers.FileReaderManager;
import sdp.PageObjectManager;

public class Automation_Project extends Base_Class {

	public static WebDriver driver = getBrowser("chrome");

	public static PageObjectManager pom = new PageObjectManager(driver);

	public static void main(String[] args) throws Throwable {

		String url = FileReaderManager.getInstance().getInstanceCr().getUrl();

		getUrl(url);

		clickOnElement(pom.getInstanceHp().getSignIn_Btn());

		Thread.sleep(5000);
		
		String username = FileReaderManager.getInstance().getInstanceCr().getUsername();

		inputValueElement(pom.getInstanceSp().getUsername(), username);
		
		String password = particular_Data("C:\\Users\\nehru\\Desktop\\Logu Java Class\\Selenium Project\\MiniProjectSelenium.xlsx",
						7, 5);
		
		inputValueElement(pom.getInstanceSp().getPassword(), password);

		clickOnElement(pom.getInstanceSp().getSignIn());

		clickOnElement(pom.getInstanceDp().getDresses());

		clickOnElement(pom.getInstanceCd().getCasualdress());

		jsExecuterDown(pom.getInstanceDsp().getTitleblock());

		clickOnElement(pom.getInstanceSize().size);

		clickOnElement(pom.getInstanceColor().getColour());

		Thread.sleep(5000);

		screenShot("C:\\Users\\nehru\\eclipse-workspace\\Automation_Practise\\ScreenShot\\ProjectPic01");

		clickOnElement(pom.getInstanceCartframe().getAddtocartframe());

		clickOnElement(pom.getInstanceCart().getAddtocart());

		Thread.sleep(5000);

		screenShot("C:\\Users\\nehru\\eclipse-workspace\\Automation_Practise\\ScreenShot\\ProjectPic02");

		clickOnElement(pom.getInstanceCheckout().getProceedtocheckout());

		clickOnElement(pom.getInstanceProceedtoCheck().getCheckout());

		clickOnElement(pom.getInstanceSignCheckout().getCheckout1());

		jsExecuterDown(pom.getInstanceShipping().getShipping());

		screenShot("C:\\Users\\nehru\\eclipse-workspace\\Automation_Practise\\ScreenShot\\ProjectPic03");

		clickOnElement(pom.getInstanceSignout().getSignout());

	}
	
	

}
