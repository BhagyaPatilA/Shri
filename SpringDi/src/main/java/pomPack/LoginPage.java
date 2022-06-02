package pomPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
    @FindBy (xpath="//input[@name='username']")
    private WebElement username;
    
    @FindBy (xpath="//input[@name='pwd']")
    private WebElement password;
    
    @FindBy (xpath="//a[@id='loginButton']")
    private WebElement login;
  
    
    
    @FindBy (xpath="//input[@id='keepLoggedInCheckBox']")
    private WebElement keepMeLoginCheckbox ;
    
   
    
    public LoginPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    	
    }
    
    
    
    public void sendUsername()
    {
    	username.sendKeys("bhagyashripatil135@gmail.com");
    }
    
    public void sendPasswordName()
    {
    	password.sendKeys("uTyTXtYj");
    }
    
    public void selectKeepMeLogin()
    {
    	keepMeLoginCheckbox.click();
    }
    
    public void clickOnLogin()
    {
    	login.click();
    }
}
