package SeleniumHomeWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Assignment3Test
{
	WebDriver driver;
  @Parameters ({ "browser"})
  @Test
  public void Launchtc(String browser)
  {
	  switch(browser)
	  {
	  case "chrome":
			System.setProperty("webdriver.chromedriver",
					"C:\\Swathi-QA\\Drivers\\Chrome\\chrome-win64\\chromedriver.exe");
			ChromeOptions c = new ChromeOptions();
			c.setBinary("C:\\Swathi-QA\\Drivers\\Chrome\\ChromeDriver\\chromedriver-win64\\chrome.exe");
			driver = new ChromeDriver();
			break;

	  case "firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\Swathi-QA\\Drivers\\Firefox-Gecko\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
			
	  default:
			System.out.println("Invalid");	
	  
	  driver.get("https://flipkart.com");
	  }
  }
}
