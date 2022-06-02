package pomPack2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookLoginPage
{
    @FindBy (xpath="//input[@id='email']")
    private WebElement username;
    
    @FindBy (xpath="//input[@id='pass']")
    private WebElement password;
    
    @FindBy (xpath="//button[@data-testid='royal_login_button']")
    private WebElement login;
    
    public FaceBookLoginPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void sendUsername()
    {
    	username.sendKeys("7028292809");
    }
    
    public void sendPassword()
    {
    	password.sendKeys("durga1");
    }
    
    public void clickonLogin()
    {
    	login.click();
    }
}

