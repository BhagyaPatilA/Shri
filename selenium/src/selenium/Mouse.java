package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mouse
{
  public static void main(String[] args) throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver" , "C:\\Users\\AMIT\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.w3schools.com/sql");
	  driver.manage().window().maximize();
	
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	 // js.executeScript("window.scrollBy(0,1000)");
	  Thread.sleep(5000);
	 // js.executeScript ("window.scrollBy(0,800)");
	  
	  WebElement sql =driver.findElement(By.xpath("//h2[text()='SQL Data Types']"));
	  js.executeScript("arguments[0].scrollIntoView(true);",sql );
	  sql.click();
	  
}
}
