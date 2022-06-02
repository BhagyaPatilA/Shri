package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomPack.HomePage2;
import pomPack.LoginPage2;

public class VerifyAnnotations 
{
    WebDriver driver ;
    HomePage2 homepage;
    LoginPage2 loginpage;
    
     @BeforeClass
     public void launchBrowser()
     {
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\AMIT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
     	driver = new ChromeDriver();
     	 driver.get("https://online.actitime.com/bpatil/login.do");
     	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
     	
     }
     
     @BeforeMethod
     public void loginto() throws InterruptedException
     {
    	Thread.sleep(5000); 
    	loginpage = new LoginPage2(driver);
    	loginpage.sendUsername();
    	loginpage.sendPasswordName();
    	loginpage.selectKeepMeLogin();
    	loginpage.clickOnLogin();
    	homepage = new HomePage2(driver);
    				
     }
     
     @Test
     public void verifyTaskTab()
     {
    	
     	homepage.clickOnTimeTrack();
     	String url = driver.getCurrentUrl();
     	String title = driver.getTitle();
     	
     	System.out.println(url);
     	System.out.println(title);
     	
     	if(url.equals("https://online.actitime.com/bpatil/tasks/tasklist.do")&&title.equals("actiTIME - Task List"))
     	{
     	     System.out.println("PASS");
     	}
     	else
     	{
     		System.out.println("FAIL");
     	}
     	
     }
     
     @Test
     public void verifyReportTab()
     {    
    	
     	homepage.clickOnReportsTab();
     	String url = driver.getCurrentUrl();
     	String title = driver.getTitle();
     	
     	System.out.println(url);
     	System.out.println(title);
     	
     	if(url.equals("https://online.actitime.com/bpatil/reports/dashboard.do"))
     	{
     		System.out.println("PASS");
     	}
     	else
     	{
     		System.out.println("FAIL");
     	}
     }
     
     @AfterMethod
     public void logoutfromApplication()
     {
    	
         homepage.clickOnlogout();
     
     }
     
     @AfterClass
     public void afterclass()
     {
    	 driver.close();
     }
     
     
     
}
