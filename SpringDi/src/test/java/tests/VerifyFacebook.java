package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomPack2.FaceBookHomePage;
import pomPack2.FaceBookLoginPage;

public class VerifyFacebook
{
   public static void main(String[]args) throws InterruptedException
   {
	  
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\AMIT\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
 
		driver.get("https://www.facebook.com/");
		FaceBookLoginPage   loginpage= new FaceBookLoginPage(driver);	
		loginpage.sendUsername();
		loginpage.sendPassword();
		loginpage.clickonLogin();
		
	FaceBookHomePage homepage = new FaceBookHomePage(driver);
	Thread.sleep(5000);
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


	homepage.clickonIntroduction();
	String url1 = driver.getCurrentUrl();
	String title1 = driver.getTitle();
	 System.out.println(url1);
	 System.out.println(title1);
	 if(url1.equals("https://www.facebook.com/watch/?ref=tab")&&title1.equals("(4) Facebook"))
	 {
		 System.out.println("PASS");
	 }
	 else
	 {
		 System.out.println("FAIL");
	 }
	 
	

     Thread.sleep(10000);
	homepage.clickOnLogout();
	



	driver.close();
}
}




