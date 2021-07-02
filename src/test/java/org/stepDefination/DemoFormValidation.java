package org.stepDefination;

import java.io.IOException;
import java.util.List;

import org.functionalLibraries.BaseClass;
import org.junit.Assert;
import org.objectRepository.ContactPageObjects;
import org.objectRepository.HomePageObjects;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoFormValidation extends BaseClass {

	@Given("The user need to be on Growth Engineering Contact page")
	public void the_user_need_to_be_on_Growth_Engineering_Contact_page() throws IOException {
		HomePageObjects homePageObject = new HomePageObjects();
		BaseClass.launchUrl("https://www.growthengineering.co.uk/contact/");
		Assert.assertTrue("The uesr successfully in GrowthEngineering Enqiury form page",
				currentUrl().equals("https://www.growthengineering.co.uk/contact/"));
		WaitForElement(homePageObject.getPopupText(), 3000);
		if (homePageObject.getPopupNoThanksBtn().isDisplayed()) {
			BaseClass.click(homePageObject.getPopupNoThanksBtn());
		}
		WaitForElement(homePageObject.getGetInTouchBtn(), 3000);
		BaseClass.screenshot("Contactpage");
	}

	@When("The user need to fill the forms on contact page")
	public void the_user_need_to_fill_the_forms_on_contact_page(io.cucumber.datatable.DataTable dataTable) throws IOException {
		ContactPageObjects contactPageObjects = new ContactPageObjects();
		List<List<String>> asLists = dataTable.asLists(String.class);
		System.out.println("Enter Form page value - Started");
		sendKeys(contactPageObjects.getFirstName(), asLists.get(0).get(0));
		sendKeys(contactPageObjects.getLastName(), asLists.get(1).get(0));
		sendKeys(contactPageObjects.getWorkEmail(), asLists.get(2).get(0));
		sendKeys(contactPageObjects.getTelephone(), asLists.get(3).get(0));
		sendKeys(contactPageObjects.getCompanyName(), asLists.get(4).get(0));
		click(contactPageObjects.getFirstName());
		ddSelectByVisibleText(contactPageObjects.getCounterDD(), asLists.get(5).get(0));
		ddSelectByVisibleText(contactPageObjects.getRoleDD(), asLists.get(6).get(0));
		ddSelectByVisibleText(contactPageObjects.getEnquiryPurposeDD(), asLists.get(7).get(0));
		if (contactPageObjects.getPrivecyPolicyCB().isEnabled()) {
			click(contactPageObjects.getPrivecyPolicyCB());
		}
		BaseClass.screenshot("FormDetails");
		System.out.println("The values are entered successfully on Form page");
	}
}
