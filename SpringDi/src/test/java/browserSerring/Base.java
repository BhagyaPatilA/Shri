package browserSerring;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Base
{
    public static WebDriver openChromeBrowser() 
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\AMIT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
		return driver;
    	
    }
    
    public static WebDriver openEdgeBrowser()
    {
    	System.setProperty("webdriver.edge.driver", "C:\\Users\\AMIT\\Downloads\\edgedriver_win64\\msedgedriver.exe");
    	WebDriver driver = new EdgeDriver();
    	return driver;
    }
    
    public static WebDriver openOperaminiBrowser()
    {
    	System.setProperty("webdriver.opera.browser", "C:\\Users\\AMIT\\Downloads\\operadriver_win64\\operadriver_win64\\operadriver.exe");
    	WebDriver driver = new OperaDriver();
    	return driver;
    }
}
