package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ege
{
  public static void main(String[] args)
  {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\AMIT\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	driver.manage().window().maximize();
}
}
