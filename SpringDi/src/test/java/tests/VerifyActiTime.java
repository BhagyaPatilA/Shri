package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomPack.HomePage;
import pomPack.LoginPage;

public class VerifyActiTime 
{
    public static void main(String[] args) throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\AMIT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
    	
    	driver.get("https://online.actitime.com/bpatil/login.do");
    	
    	LoginPage loginpage = new LoginPage(driver);
    	loginpage.sendUsername();
    	loginpage.sendPasswordName();
    	loginpage.clickOnLogin();
    	loginpage.selectKeepMeLogin();
    	
    	HomePage homepage = new HomePage(driver);
    	Thread.sleep(5000);
    	homepage.clickOnTasksTab();
    	
    	String Url = driver.getCurrentUrl();
    	String Title = driver.getTitle();
    	
    	System.out.println(Url);
    	System.out.println(Title);
    	
    	if(Url.equals("https://online.actitime.com/bpatil/tasks/tasklist.do")&&Title.equals("actiTIME - Task List"))
    	{
    		System.out.println("PASS");
    	}
    	else
    	{
    		System.out.println("FAIL");
    	}
    	
    	homepage.clickOnlogout();
    	
    	
	}
}
