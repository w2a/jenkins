package testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import core.Page;
import pages.LandingPage;
import pages.LoginPage;
import utility.TestUtil;

public class LoginTest extends Page{
	
	@BeforeTest
	public void isSkip() throws IOException{
		
		init();
		
		if(!TestUtil.isExecutable("LoginTest")){
			throw new SkipException("Skipping the test case as the run mode is NO");
			
		}
		
	}
	
	
	@Test
	public void doLogin() throws IOException{
		
		
		
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		LandingPage lp = login.doLogin("seleniumcoaching@gmail.com", "234525");
		
		
	}
	

}
