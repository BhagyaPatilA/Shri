package selenium;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot
{
      

	public static void main(String[] args) throws IOException {
		
		 Calendar cal = Calendar.getInstance();
		 java.util.Date time =  cal.getTime();
		 String timelamp = time.toString().replace(":", "").replace(" ", "");
		 System.out.println(time);
		 System.out.println(timelamp);
		 
		 System.setProperty("webdriver.chrome.driver" , "C:\\Users\\AMIT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.amazon.com/");
		 
		  TakesScreenshot s = (TakesScreenshot) driver;
		  File Source = s.getScreenshotAs(OutputType.FILE);
	   	  File dest = new File("C:\\Users\\AMIT\\Pictures\\Screenshots\\"+timelamp+ ".jpg");
		  FileHandler.copy(Source, dest);
		 
		 
		
		
		  
		  
		  
		  
		  
	}
}
