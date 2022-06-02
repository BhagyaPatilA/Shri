package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import browserSerring.Base;
import pomPack.HomePage;
import pomPack.LoginPage;
import untils.Utility;

public class Verifyapplication extends Base
{
    WebDriver driver;
    HomePage homepage;
    LoginPage loginpage;
    int testcaseID;
    
    
    
    @Parameters("browser")
    @BeforeTest
    public void launchBrowser(String browser)
    {
    	if(browser.equals("ChromeBrowser"))
    	{
    		driver = openChromeBrowser();
    	}
    	if(browser.equals("EdgeBrowser"))
    	{
    		driver = openEdgeBrowser();
    	}
    	if(browser.equals("OperaBrowser"))
    	{
    		driver = openOperaminiBrowser();
    	}
    	
    	driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
    	
    }
    
    @BeforeClass
    public void launchBrowser()
    {
    	loginpage = new LoginPage(driver);
    	homepage  = new HomePage(driver);
    }
    
    @BeforeMethod
    public void logintoapplication() throws InterruptedException, IOException
    {
    driver.get("https://online.actitime.com/bpatil/login.do");
    
    Thread.sleep(5000);
    
   
    loginpage.sendUsername();
    loginpage.sendPasswordName();
    loginpage.selectKeepMeLogin();
    loginpage.clickOnLogin();
    }
    
    @Test
    public void verifyTaskTab()
    {
    	homepage.clickOnTasksTab();
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
    	testcaseID = 2201;
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
    public void logoutfromApplication(ITestResult result) 
    {
       if(ITestResult.FAILURE == result.getStatus())
       {
    	   Utility.captureScreenshot(testcaseID, driver);
       }
    
    	homepage.clickOnlogout();
    }
    
    @AfterClass
    public void clearPOMobjects()
    {
    	loginpage = null;
    	homepage = null;
    }	
    
    @AfterTest
    public void closBrowser()
    {
    	driver.close();
    	driver = null;
    	System.gc();
    }
    
    
}
