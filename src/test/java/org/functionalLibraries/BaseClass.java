package org.functionalLibraries;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class BaseClass {
	public static WebDriver driver;
	public static Select sc;
	
	public static WebDriver DriverInit(String browserName) {
		if (browserName.toUpperCase().equals("CHROME")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Project\\GrowthEngineering\\src\\test\\resources\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("ie")) {
			System.setProperty("webdriver.IE.driver", "D:\\Project\\GrowthEngineering\\src\\test\\resources\\Drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Project\\GrowthEngineering\\src\\test\\resources\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;

	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static void getCurrentData() {
		Date d = new Date();
		System.out.println(d);
	}

	public static WebElement sendKeys(WebElement element, String value) {
		element.sendKeys(value);
		return element;
	}

	public static void screenshot(String imgName) throws IOException {

		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("GrowthEngineering\\target\\Screenshot\\" + imgName + ".jpg");
		FileUtils.copyFile(src, des);
	}

	public static void closeBrowser() {
		driver.close();
	}

	public static void quitBrowser() {
		driver.quit();
	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void ddselectbyindex(WebElement element, int index) {
		sc = new Select(element);
		sc.selectByIndex(index);
	}

	public static void ddSelectByValue(WebElement element) {
		sc = new Select(element);
		sc.selectByValue("value");
	}

	public static void ddSelectByVisibleText(WebElement element, String text) {
		sc = new Select(element);
		sc.selectByValue(text);
	}

	public static void ddDeselectbyindex(WebElement element, int index) {
		sc = new Select(element);
		sc.deselectByIndex(index);
	}

	public static void ddDeSelectByValue(WebElement element) {
		sc = new Select(element);
		sc.deselectByValue("value");
	}

	public static void ddDeSelectByVisibleText(WebElement element, String text) {
		sc = new Select(element);
		sc.deselectByValue(text);
	}

	public static void ddDeSelectAll(WebElement element) {
		sc = new Select(element);
		sc.deselectAll();
	}

	public static void implicitWait(int miliSeconds) {
		driver.manage().timeouts().implicitlyWait(miliSeconds, TimeUnit.SECONDS);
	}

	public static void WaitForElement(WebElement locator, int miliSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, miliSeconds);
		wait.until(ExpectedConditions. visibilityOf(locator));
	}

	public static String currentUrl() {
		String textUrl = driver.getCurrentUrl();
		System.out.println(textUrl);
		return textUrl;
	}

	public static String windowTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		return title;
	}

	public static String parentWindowId() {
		String parWindow = driver.getWindowHandle();
		return parWindow;
	}

	public static List<String> allWindowId() {
		Set<String> allWindows = driver.getWindowHandles();
		List<String> listAllwindowID = new ArrayList<String>();
		listAllwindowID.addAll(allWindows);
		return listAllwindowID;

	}
	
}
