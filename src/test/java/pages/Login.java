package pages;

import java.security.PublicKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	    WebDriver driver;
	
	   Public LoginPage(WebDriver driver) {
	      this.driver=driver;
	
	}
	
	//locators&Elements
	By UName=By.name("uid");
	By UPword=By.name("password");
	By Submit=By.name("btnLogin");

	//methods&Actions
	
	Public void Login_Method() { 
	       driver.findElement(UName).sendKeys("mngr532503");
	       driver.findElement(UPword).sendKeys("EjAtqU"); 
	       driver.findElement(Submit).click();
	

	}
	
	
}

