package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomPack2.FaceBookHomePage;
import pomPack2.FaceBookLoginPage;

public class VerifyFac 
{
	WebDriver driver;
	FaceBookHomePage homepage;
	FaceBookLoginPage loginPage;
	
	@BeforeClass
	public void launchBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AMIT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
	}	
	
	@BeforeMethod
	public void logintoApplication() throws InterruptedException
	{
		    Thread.sleep(7000);
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			Thread.sleep(5000);
		    loginPage= new FaceBookLoginPage(driver);	
			loginPage.sendUsername();
			loginPage.sendPassword();
			loginPage.clickonLogin();
			
		    homepage = new FaceBookHomePage(driver);
	}
	
	@Test
	public void verifyWatch() throws InterruptedException
	{
		Thread.sleep(7000);
		homepage.clickonWatch();
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		System.out.println(url);
	    System.out.println(title);
	    
		 if(url.equals("https://www.facebook.com/watch/?ref=tab")&&title.equals("(4) Facebook"))
		 {
			 System.out.println("PASS");
		 }
		 else
		 {
			 System.out.println("FAIL");
		 }
	}
	
	
	
	
	
	@AfterClass
	public void afterclass()
	{
		driver.close();
	}





}
