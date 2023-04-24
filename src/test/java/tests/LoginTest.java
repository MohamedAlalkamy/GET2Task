package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pages.Login;


public class LoginTest extends TestBase {
	
	  Login loginPage_object;

     String Email="m@m.com";
     String Password="Mosamir22";

    @Test
    public void login_success() throws InterruptedException
    {
 
        
        driver.findElement(By.cssSelector("#ACCOUNT")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"fadein\"]/header/div/div/div/div/div/div[2]/div/div[2]/div[3]/div/ul/li[1]/a")).click();
        Thread.sleep(1000);

    
    	loginPage_object=new Login(driver);
        loginPage_object.userLogin(Email,Password);
        
        
    }
	
	
}
