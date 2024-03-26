package JavaHomeWork1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

//TestScript

///This class consists just the webelements and methods
public class pfDemo 
{
 WebDriver driver;

@FindBy (how = How.NAME,using = "email")WebElement unm;
@FindBy (how = How.NAME,using = "pass")WebElement pswd;
@FindBy (how = How.NAME,using = "login")WebElement login;


public void Login()
	{
		unm.sendKeys("aaa");
		unm.click();
		pswd.sendKeys("bbb");
		pswd.click();
		login.click();	
		
	}
}
