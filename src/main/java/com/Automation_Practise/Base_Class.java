package com.Automation_Practise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import com.google.common.io.Files;

public class Base_Class {

	public static WebDriver driver;

	public static String value;

	public static WebDriver getBrowser(String type) {

		if (type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();

		} else if (type.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\Driver\\msedgedriver.exe");

			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();

		return driver;
	}

	public static void clickOnElement(WebElement element) {

		element.click();
	}

	public static void inputValueElement(WebElement element, String name) {

		element.sendKeys(name);

	}

	public static void getUrl(String url) {

		driver.get(url);
	}

	public static void waitTime_Sec(int sec) {

		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}

	public static void jsExecuterDown(WebElement scrollDown) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", scrollDown);
	}

	public static void jsExecuterUp(WebElement scrollUp) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", scrollUp);
	}

	public static void screenShot(String userPath) throws IOException {
		TakesScreenshot shot = (TakesScreenshot) driver;
		File src = shot.getScreenshotAs(OutputType.FILE);
		File dest = new File(userPath);
		FileUtils.copyFile(src, dest);
	}

	public static void action(WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
	}

	public static void close(WebElement close) {
		close(close);
	}
	public static void clear(WebElement clear) {
			clear(clear);
		}


	public static void quit(WebElement quit) {
		quit(quit);
	}

	public static void navigate(WebElement navigate) {
		navigate(navigate);
	}

	public static void navigateto(WebElement navigateto) {
		navigateto(navigateto);
	}

	public static void navigateBack(WebElement navigateBack) {
		navigateBack(navigateBack);
	}

	public static void navigateForward(WebElement navigateForward) {
		navigateBack(navigateForward);
	}

	public static void navigateRefresh(WebElement navigateRefresh) {
		navigateBack(navigateRefresh);
	}

	public static void alertAccept(WebElement alertAccept) {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public static void alertDismiss(WebElement alertDismiss) {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	public static void alertSendKeys(WebElement alertSendKeys) {
		Alert alert = driver.switchTo().alert();
		alertSendKeys(alertSendKeys);
	}

	public static void alertGetText(WebElement alertGetText) {
		Alert alert = driver.switchTo().alert();
		alertGetText(alertGetText);
	}

	public static void getText(WebElement getText) {
		getText(getText);
	}

	public static void isEnable(WebElement isEnable) {
		isEnable(isEnable);
	}

	public static void isDisplayed(WebElement isDisplayed) {
		isDisplayed(isDisplayed);
	}

	public static void isSelected(WebElement isSelected) {
		isSelected(isSelected);
	}

	public static void getOptions(WebElement getOptions) {
		getOptions(getOptions);
	}

	public static void getTitle(WebElement getTitle) {
		getTitle(getTitle);
	}

	public static void isMultiple(WebElement isMultiple) {
		isMultiple(isMultiple);
	}

	public static void dropdown(String type, WebElement element, String value) {

		Select s = new Select(element);

		if (type.equalsIgnoreCase("index")) {

			int index = Integer.parseInt(value);

			s.deselectByIndex(index);

		} else if (type.equalsIgnoreCase("text")) {

			s.selectByVisibleText(value);
		}

		else if (type.equalsIgnoreCase("value")) {

			s.deselectByValue(value);
		}

	}

	public static String particular_Data(String pathname, int row_index, int cell_index) throws Throwable {

		File f = new File(pathname);

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis);

		Sheet sheetAt = w.getSheetAt(0);

		Row row = sheetAt.getRow(row_index);

		Cell cell = row.getCell(cell_index);

		CellType cellType = cell.getCellType();

		if (cellType.equals(cellType.STRING)) {

			value = cell.getStringCellValue();
			
		} else if (cellType.equals(cellType.NUMERIC)) {

			double d = cell.getNumericCellValue();

			value = Double.toString(d);
		}
		return value;

	}

}
