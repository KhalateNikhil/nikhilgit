package StepDefinition;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.PimPage;
import io.cucumber.java.en.When;

public class PimPageSteps extends BaseClass{

	private static PimPage pimpage;

@When("user click on pim page")
public void user_click_on_pim_page() throws InterruptedException {
	 pimpage= new PimPage();
	 pimpage.clickOnPim();
	
   }
@When("validate user is on pim page")
public void validate_user_is_on_pim_page() {
   
	Assert.assertTrue(pimpage.validatePimPageUrl().contains("pim"));
}

}
