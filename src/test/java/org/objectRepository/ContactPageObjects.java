package org.objectRepository;

import java.util.List;

import org.functionalLibraries.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPageObjects extends BaseClass {
	public ContactPageObjects() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[starts-with(@id,'firstname')]")
	private WebElement firstName;
	@FindBy(xpath = "//input[starts-with(@id,'lastname')]")
	private WebElement lastName;
	@FindBy(xpath = "//input[starts-with(@id,'email')]")
	private WebElement workEmail;
	@FindBy(xpath = "//input[starts-with(@id,'phone')]")
	private WebElement telephone;
	@FindBy(xpath = "//input[starts-with(@id,'company')]")
	private WebElement companyName;
	@FindBy(xpath = "//select[starts-with(@id,'country')]")
	private WebElement counterDD;
	@FindBy(xpath = "///span[text()='0-500']")
	private WebElement audienceSize;
	@FindBy(xpath = "//select[starts-with(@id,'role')]")
	private WebElement roleDD;
	@FindBy(xpath = "//select[contains(@id,'the_purpose_of_your_enquiry')]")
	private WebElement enquiryPurposeDD;
	@FindBy(xpath = "//input[contains(@id,'i_have_read_and_understand_growth_engineering')]")
	private WebElement privecyPolicyCB;

	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}

	public WebElement getWorkEmail() {
		return workEmail;
	}

	public void setWorkEmail(WebElement workEmail) {
		this.workEmail = workEmail;
	}

	public WebElement getTelephone() {
		return telephone;
	}

	public void setTelephone(WebElement telephone) {
		this.telephone = telephone;
	}

	public WebElement getCompanyName() {
		return companyName;
	}

	public void setCompanyName(WebElement companyName) {
		this.companyName = companyName;
	}

	public WebElement getCounterDD() {
		return counterDD;
	}

	public void setCounterDD(WebElement counterDD) {
		this.counterDD = counterDD;
	}

	public WebElement getAudienceSize() {
		return audienceSize;
	}

	public void setAudienceSize(WebElement audienceSize) {
		this.audienceSize = audienceSize;
	}

	public WebElement getRoleDD() {
		return roleDD;
	}

	public void setRoleDD(WebElement roleDD) {
		this.roleDD = roleDD;
	}

	public WebElement getEnquiryPurposeDD() {
		return enquiryPurposeDD;
	}

	public void setEnquiryPurposeDD(WebElement enquiryPurpose) {
		this.enquiryPurposeDD = enquiryPurpose;
	}

	public WebElement getPrivecyPolicyCB() {
		return privecyPolicyCB;
	}

	public void setPrivecyPolicyCB(WebElement privecyPolicyCB) {
		this.privecyPolicyCB = privecyPolicyCB;
	}

}
