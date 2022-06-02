package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Open 
{
	public static void main(String[] args) 
	   {
		System.setProperty("webdriver.opera.driver", "C:\\Users\\AMIT\\Downloads\\operadriver_win32\\operadriver_win32\\operadriver.exe");
		WebDriver driver = new OperaDriver();
		driver.get("https://online.actitime.com/bpatil/login.do");
	   }
}	