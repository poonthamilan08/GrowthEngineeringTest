package org.objectRepository;

import java.util.List;

import org.functionalLibraries.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects extends BaseClass {
	public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h3[text()='THE ACADEMY LMS']")
	private WebElement popupText;
	@FindBy(xpath = "//a[text()='No Thanks!']")
	private WebElement popupNoThanksBtn;
	@FindBy(xpath = "//ul[@id='menu-1-9cb56d6']/li/a")
	private List<WebElement> navMenuItem;
	@FindBy(xpath = "///span[text()='GET IN TOUCH']")
	private WebElement getInTouchBtn;
	
	
	public WebElement getPopupText() {
		return popupText;
	}
	public void setPopupText(WebElement popupText) {
		this.popupText = popupText;
	}
	
	public WebElement getGetInTouchBtn() {
		return getInTouchBtn;
	}
	public void setGetInTouchBtn(WebElement getInTouchBtn) {
		this.getInTouchBtn = getInTouchBtn;
	}
	public WebElement getPopupNoThanksBtn() {
		return popupNoThanksBtn;
	}
	public void setPopupNoThanksBtn(WebElement popupNoThanksBtn) {
		this.popupNoThanksBtn = popupNoThanksBtn;
	}
		
	public List<WebElement> getNavMenuItem() {
		return navMenuItem;
	}
	public void setNavMenuItem(List<WebElement> navMenuItem) {
		this.navMenuItem = navMenuItem;
	}
	
	

}
