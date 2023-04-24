package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;



public class Registerpage extends PageBase  {

	WebDriver driver;
	
	
	 public Registerpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	


   

     @FindBy(name ="first_name")
   
     WebElement fn_txtbox;
     

     @FindBy(name = "last_name")
     
     WebElement ln_txtbox;
     
     
     @FindBy(name = "phone")
     
     WebElement phone_txtbox;
     

     @FindBy(name = "email")
    
     WebElement email_txtbox;
     
     
     @FindBy(name = "password")
     
     WebElement password_txtbox;

  
     @FindBy(id = "button")
     
     WebElement register_btn;
    

     
   

     public void userRegistration(String firstname , String lastname , String phone , String email ,String password)
     {
           
         setElementText(fn_txtbox,firstname);
         setElementText(ln_txtbox,lastname);
         setElementText(email_txtbox,email);
         setElementText(phone_txtbox,phone);
         setElementText(password_txtbox,password);
         
         
      //   clickButton(register_btn);
         
     }

	
	
}
