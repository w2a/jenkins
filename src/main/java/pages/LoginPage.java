package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Constants;
import core.Page;

public class LoginPage extends Page {

	@FindBy(xpath=Constants.username)
	public WebElement user;
	@FindBy(xpath=Constants.password)
	public WebElement pass;
	@FindBy(xpath=Constants.signin)
	public WebElement signin;
	
	
	
	public LandingPage doLogin(String username, String password){
		
		
		user.sendKeys(username);
		pass.sendKeys(password);
		signin.click();
		
		return PageFactory.initElements(driver, LandingPage.class);
		
	}
	
	
}
