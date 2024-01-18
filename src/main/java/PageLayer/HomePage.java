package PageLayer;

import BaseLayer.BaseClass;

public class HomePage extends BaseClass{
	
	public String validateHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public String validateHomePageUrl()
	{
		return driver.getCurrentUrl();
	}

}
