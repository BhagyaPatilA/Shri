package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

@SuppressWarnings("deprecation")
public class OperaMini 
{
    public static void main(String[] args)
    {
		 System.setProperty("webdriver.opera.driver", "C:\\Users\\AMIT\\Downloads\\operadriver_win64\\operadriver_win64\\operadriver.exe");
		 WebDriver driver = new OperaDriver();
		 driver.get("https://www.w3schools.com/js/js_popup.asp");
		 
		 
	}
}
