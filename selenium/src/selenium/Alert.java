package selenium;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\AMIT\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.w3schools.com/js/js_popup.asp");
	 driver.manage().window().maximize();
	 
	 WebElement alert = driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_alert']"));
	 alert.click();
	 String url=driver.getCurrentUrl();
	 System.out.println(url);
	 
	 Thread.sleep(5000);
	 
	 ArrayList<String> Add = new ArrayList<String>(driver.getWindowHandles());
	 String Childadd =Add.get(1);
	 System.out.println(Childadd);
	 Thread.sleep(5000);
	 
	 driver.switchTo().window(Childadd);
	 url=driver.getCurrentUrl();
	 System.out.println(url);
			 
	 
}
}
