package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login extends PageBase {
	
	public Login(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

    
    
    @FindBy(name = "email")
      WebElement email_txtbox;

    @FindBy(name = "password")
    WebElement password_txtbox;

    @FindBy(xpath ="//*[@id=\"fadein\"]/div[4]/div/div[2]/div[2]/div/form/div[3]/button")
    WebElement login_btn;
    
    public void userLogin( String email , String password  )
    {
        setElementText(email_txtbox,email);
        setElementText(password_txtbox,password);
        clickButton(login_btn);
    }
    
    
	

}