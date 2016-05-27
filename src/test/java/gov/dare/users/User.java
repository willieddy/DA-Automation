package gov.dare.users;

import org.junit.Assert;

import gov.dare.pageObjects.HomepageObject;
import net.thucydides.core.annotations.Step;

public class User 
{
	HomepageObject homepage;
	
	@Step
	public void open_page() 
	{
		homepage.open();
	}
	
	@Step
	public void open_page(String url)
	{
		homepage.openAt(url);
	}
	
	@Step
	public void clickNavigation(String menuItem)
	{
		homepage.clickMainNavigationMenu(menuItem);
	}
	
	@Step
	public void shouldSeeText(String expected)
	{
		String pageTitle = homepage.pullPageTitle();
		
		//lower case to account for case mismatching
		Assert.assertEquals(expected.toLowerCase(), pageTitle.toLowerCase());
	}
}