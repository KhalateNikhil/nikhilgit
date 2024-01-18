package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class PimPage extends BaseClass {

	@FindBy(xpath = "//span[text()='PIM']")
	private WebElement pim;

	public PimPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnPim() throws InterruptedException {
		Thread.sleep(5000);
		Wait.click(pim);
	}

	public String validatePimPageUrl() {
		return driver.getCurrentUrl();
	}

}
