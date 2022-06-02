package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomPack.HomePage;
import pomPack.LoginPage;

public class VerifyAnnotations 
{
    WebDriver driver ;
    
     @BeforeClass
     public void launchBrowser()
     {
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\AMIT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
     	WebDriver driver = new ChromeDriver();
     	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
     	
     }
     
     @BeforeMethod
     public void logintoApplication()
     {
    	 driver.get("https://online.actitime.com/bpatil/login.do");
     	
     	 LoginPage loginpage = new LoginPage(driver);
     	loginpage.sendUsername();
     	loginpage.sendPasswordName();
     	loginpage.clickOnLogin();
     	loginpage.selectKeepMeLogin();
     	
     	
     }
     
     @Test
     public void verifyTaskTab()
     {
    	 HomePage homepage = new HomePage(driver);
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
    	 HomePage homepage = new HomePage(driver);
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
    	 HomePage homepage = new HomePage(driver);	 
     homepage.clickOnlogout();
     
     }
     
     @AfterClass
     public void afterclass()
     {
    	 driver.close();
     }
     
     
     
}
