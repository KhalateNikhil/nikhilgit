package StepDefinition;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import io.cucumber.java.en.Given;

public class HomePageSteps extends BaseClass{
	private static HomePage homepage;

@Given("user is on home page and validate home page title")
public void user_is_on_home_page_and_validate_home_page_title() 
{
	homepage= new HomePage();
	Assert.assertEquals(homepage.validateHomePageTitle(), "OrangeHRM");
   
}
@Given("user validate home page url")
public void user_validate_home_page_url() 
{
	Assert.assertTrue(homepage.validateHomePageUrl().contains("php"));
   
}

}
