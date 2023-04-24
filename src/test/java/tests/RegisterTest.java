package tests;





import javax.xml.datatype.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Registerpage;



public class RegisterTest extends TestBase {

	public JavascriptExecutor jse;
	Registerpage reg_page_object;
	
	 String firstName="Mohamed";
     String lastName="Samir";
     String phone="01016325464";
     String email="m@m.com";
     String password= "Mosamir22";
	
     @Test(priority = 1)
     public void register_success()
     {
    	
       reg_page_object=new Registerpage(driver);
       reg_page_object.userRegistration(firstName, lastName, phone, email, password);
     
 
       
      Select listoptions = new Select(driver.findElement(By.cssSelector("#account_type")));
       listoptions.selectByValue("supplier");
         
      driver.findElement(By.xpath("//*[@id=\"rc-anchor-container\"]/div[3]/div[1]/div/div")).click();
    
       
     }
	
	
}


   // Sorry I Can not handle ReCAPTCHA For Now I Can Do it later. But I already registered with those data and also logged in 


