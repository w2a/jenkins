package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Page;

public class LandingPage extends Page {
	
	@FindBy(xpath="//*[@id='page-container']/div[1]/div[1]/div[1]/a/div/div/b")
	public WebElement profile;
	
	public EditProfile gotoProfile(){
		
		profile.click();
		
		return PageFactory.initElements(driver, EditProfile.class);
		
	}
	
	public void gotoTweets(){
		
		
	}
	
	public void gotoFollowers(){
		
		
		
	}

}
