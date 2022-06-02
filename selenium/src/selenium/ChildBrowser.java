package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser
{
  public static void main(String[] args) throws InterruptedException
  {
	     System.setProperty("webdriver.chrome.driver","C:\\Users\\AMIT\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		 driver.manage().window().maximize();
		 
		//Thread.sleep(3000);
		// WebElement alert = driver.findElement(By.xpath("//button[@id='alertBox']"));
		// alert.click();
		// Alert alt = driver.switchTo().alert();
		// String text=alt.getText();
		// System.out.println(text);
		 Thread.sleep(2000);
		// alt.accept();
		 
		// WebElement confirm = driver.findElement(By.xpath("//button[@id='confirmBox']"));
		// confirm.click();
		// Alert alt=driver.switchTo().alert();
		// String texta =alt.getText();
		// System.out.println(texta);
		// Thread.sleep(5000);
		// alt.dismiss();
		 
		 WebElement promot = driver.findElement(By.xpath("//button[@id='promptBox']"));
		 promot.click();
		 Alert alt=driver.switchTo().alert();
		 String text=alt.getText();
		 System.out.println(text);
		 Thread.sleep(6000);
		 alt.sendKeys(text);
		 Thread.sleep(5000);
		 alt.accept();
		 
		 
		 
		 
		 
		 
		 
}
}
