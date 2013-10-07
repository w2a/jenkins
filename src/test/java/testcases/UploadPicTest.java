package testcases;

import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import core.Page;
import pages.EditProfile;
import pages.LandingPage;
import utility.TestUtil;

public class UploadPicTest extends Page {
	
	//LandingPage lp = null;
	
	@BeforeTest
	public void isSkip(){
		
		if(!TestUtil.isExecutable("UploadPicTest")){
			throw new SkipException("Skipping the test case as the run mode is NO");
			
		}
		
	}
	
	@Test
	public void testUploadPic(){
		
		LandingPage lp = getTopMenu().gotoLandingPage();
		EditProfile ep = lp.gotoProfile();
		ep.UploadPic();
		
	}

}
