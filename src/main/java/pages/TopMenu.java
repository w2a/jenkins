package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Constants;

public class TopMenu {

	WebDriver driver;
	
	public TopMenu(WebDriver driver){
		
		this.driver = driver;
	}
	
	
	@FindBy(xpath=Constants.home)
	public WebElement homePage;
	
	
	
	public LandingPage gotoLandingPage(){
		
	homePage.click();
	
	
	return PageFactory.initElements(driver, LandingPage.class);
	
	}

}
