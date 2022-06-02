package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nouse 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\AMIT\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.ebay.com/b/Electronics/bn_7000259124");
	driver.manage().window().maximize();
	
	Actions act = new Actions(driver);
	
	WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));
	Thread.sleep(8000);
	//act.moveToElement(ele).perform();
	//act.doubleClick(ele).perform();
	act.sendKeys(ele, "bhagya").build().perform();
	
}
}
