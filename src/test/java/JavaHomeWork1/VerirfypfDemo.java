package JavaHomeWork1;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

//import TestScript.pfDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class VerirfypfDemo 
{ 
	WebDriver driver;

  @BeforeMethod
  public void Launch() 
  {
	  System.setProperty("webdriver.chromedriver", "C:\\Swathi-QA\\Drivers\\Chrome\\chrome-win64\\chromedriver.exe");
	  ChromeOptions c = new ChromeOptions();
	  c.setBinary("C:\\Swathi-QA\\Drivers\\Chrome\\ChromeDriver\\chromedriver-win64\\chrome.exe");
	  driver = new ChromeDriver();
	  
	 driver.get("https://www.facebook.com/");
  }
  @Test
  public void Login()
  {
 pfDemo obj = PageFactory.initElements(driver, pfDemo.class); // SYNTAX TO USE METHODS FROM pfDemo CLASS------FOLLOW SYNTAX-----	
 obj.Login(); // METHOD FROM pfDemo class
  }
  
  @AfterMethod
  public void teardown(ITestResult T) throws IOException
  {
	  int actualResult = T.getStatus();// int because the return result is in form of int for getStatus Method
	  int expectedResult = T.SUCCESS; //int because the return result is in form of int for SUCCESS Method	
	  
	  if
	  (actualResult == expectedResult)
	  {System.out.println("pass");
	  driver.close();
	  }
  else 
  {
	  Date Dt = new Date();
	  DateFormat df = new SimpleDateFormat("YYY/MM/DD" + "hh:mm:ss");
	  String Value = df.format(Dt);
	  File x = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	  File F = new File("src\\Reports\\abc" + Value + ".png");/// copy file from source to desired location--both should be FILE Type--------------------
	  FileUtils.copyFile(x, F);
  }
  }	
}

