package org.stepDefination;

import java.io.IOException;
import java.util.List;

import org.functionalLibraries.BaseClass;
import org.junit.Assert;
import org.objectRepository.HomePageObjects;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageMenuLinkValidation extends BaseClass {

	@Given("The user need to be on Growth Engineering home page")
	public void the_user_need_to_be_on_Growth_Engineering_home_page() throws IOException {
		HomePageObjects homePageObject = new HomePageObjects();
		BaseClass.launchUrl("https://www.growthengineering.co.uk/");
		Assert.assertTrue("The uesr successfully in GrowthEngineering HomePage",
				currentUrl().equals("https://www.growthengineering.co.uk"));
		BaseClass.screenshot("HomePage");
		WaitForElement(homePageObject.getPopupText(), 3000);
		if (homePageObject.getPopupNoThanksBtn().isDisplayed()) {
			BaseClass.click(homePageObject.getPopupNoThanksBtn());
		}

	}

	@When("The user need to click the top menu option and validate it")
	public void the_user_need_to_click_the_top_menu_option_and_validate_it(io.cucumber.datatable.DataTable dataTable) throws IOException {
		HomePageObjects homePageObject = new HomePageObjects();
		List<List<String>> asLists = dataTable.asLists(String.class);
		boolean flag = false;
		for (int navElementindex = 0; navElementindex < homePageObject.getNavMenuItem().size(); navElementindex++) {
			click(homePageObject.getNavMenuItem().get(navElementindex));
			BaseClass.WaitForElement(homePageObject.getNavMenuItem().get(navElementindex), 2000);
			if (currentUrl().contains(asLists.get(navElementindex).get(0))) {
				System.out.println("The " + asLists.get(navElementindex).get(0) + " link is working fine");
				BaseClass.screenshot(asLists.get(navElementindex).get(0));
				flag = true;
			}
		}
		if (flag != true)
			System.out.println("The given navigation menu validation text failed");
		click(homePageObject.getGetInTouchBtn());
		BaseClass.WaitForElement(homePageObject.getGetInTouchBtn(), 2000);
		BaseClass.screenshot(asLists.get(3).get(0));
		Assert.assertTrue(currentUrl().contains(asLists.get(3).get(0)));

	}
}
