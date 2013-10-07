package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import core.Constants;
import core.Page;

public class EditProfile extends Page {
	
	@FindBy(xpath=Constants.editprofile)
	public WebElement editprofile;
	@FindBy(xpath=Constants.editpic)
	public WebElement editpic;
	@FindBy(xpath=Constants.uploadpic)
	public WebElement uploadpic;
	
	
	public void UploadPic(){
		
		editprofile.click();
		editpic.click();
		uploadpic.sendKeys(Constants.picLocation);
		
		
	}
	
	public void takePic(){
		
		
	}
	
	public void removePic(){
		
		
	}

}
