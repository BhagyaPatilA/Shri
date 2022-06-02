package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe
{
  public static void main(String[] args) throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\AMIT\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  driver.switchTo().frame("iframeResult");
	  Thread.sleep(5000);
	  
	  
	  WebElement username = driver.findElement(By.xpath("//input[@name='fname']"));
	  Thread.sleep(5000);
	  username.sendKeys("bhagya");
	  driver.switchTo().parentFrame();
	  Thread.sleep(5000);
	  
	  
	  
	  
	 
	 
	  
	  
  }
	
	  
 
}
