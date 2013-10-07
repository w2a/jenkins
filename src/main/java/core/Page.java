package core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import utility.Xls_Reader;

import pages.TopMenu;


public class Page {
	
	
	public static WebDriver driver = null;
	public static Properties object = new Properties();
	public static Properties config = new Properties();
	public static FileInputStream fis;
	public static TopMenu topMenu = null;
	public static Xls_Reader excel = null;
	
	
	public static void init() throws IOException{
		
		
		if(driver==null){
			
			
			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\properties\\OR.properties");
			object.load(fis);
			
			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\properties\\config.properties");
			config.load(fis);
			
			excel = new Xls_Reader(System.getProperty("user.dir")+"\\src\\main\\resources\\properties\\testData.xlsx");
			
			if(Constants.browser.equals("firefox")){
				
				driver = new FirefoxDriver();
				
				
			}else if(Constants.browser.equals("IE")){
				
				System.setProperty("webdriver.ie.driver", "c:\\software\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}else if(Constants.browser.equals("chrome")){
				
				System.setProperty("webdriver.chrome.driver", "c:\\software\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			
			driver.get(Constants.testsite);
			driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
			
			
		}
		
		
		
	}
	
	public TopMenu getTopMenu(){
		
		if(topMenu==null){
			
			topMenu = PageFactory.initElements(driver, TopMenu.class);
		}
		
		return topMenu;
		
		
	}
	
}
