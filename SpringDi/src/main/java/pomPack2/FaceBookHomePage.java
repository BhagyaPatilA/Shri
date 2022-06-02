package pomPack2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FaceBookHomePage
{
   @FindBy (xpath="//a[@href='/watch/?ref=tab']")
   private WebElement watch;
   
   @FindBy (xpath="//div[@class='j83agx80 l9j0dhe7']")
   private WebElement introduction;
   
   @FindBy (xpath="//div[@data-nocookies='true']")
   private WebElement logout;
   
   WebDriver driver;
   WebDriverWait wait;

    
   
   public FaceBookHomePage(WebDriver driver)
   {
	   PageFactory.initElements(driver,this);
	   this.driver=driver;
	   
   }
   
   public void clickonWatch()
   {
	   wait = new WebDriverWait(driver,20);
	   wait.until(ExpectedConditions.visibilityOf(watch));
	   watch.click();
   }
   
   public void clickonIntroduction()
   {    
	   Actions act = new Actions (driver);
       act.moveToElement(introduction).perform();
	  
	   introduction.click();
   }
   
   public void clickOnLogout()
   {
	  
	   Actions act = new Actions (driver);
	   act.moveToElement(logout).perform();
	   logout.click();
   }
}
