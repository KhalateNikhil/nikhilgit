package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class HomePage extends BaseClass{
	
	
	@FindBy(xpath="//img[@alt='client brand banner']")
	private WebElement logo;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public String validateHomePageUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public boolean validateHomePageLogo()
	{
		return logo.isDisplayed();
	}
	
	
	
	
	
	

}
