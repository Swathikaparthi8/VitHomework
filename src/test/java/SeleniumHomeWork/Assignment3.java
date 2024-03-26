package SeleniumHomeWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Assignment3 {

WebDriver driver; // declaring public static here in public class, so it can be used in multiple methods

 public void launchBrowser(String browser)
{
	switch (browser) 
	{
	case "chrome":
		System.setProperty("webdriver.chromedriver","C:\\Swathi-QA\\Drivers\\Chrome\\chrome-win64\\chromedriver.exe");
		ChromeOptions c = new ChromeOptions();
		c.setBinary("C:\\Swathi-QA\\Drivers\\Chrome\\ChromeDriver\\chromedriver-win64\\chrome.exe");
		driver = new ChromeDriver();
		break;

	case "firefox":
		System.setProperty("webdriver.gecko.driver", "C:\\Swathi-QA\\Drivers\\Firefox-Gecko\\geckodriver.exe");
		driver = new FirefoxDriver();
		break;

	case "safari":
		System.setProperty("webdriver.safari.driver", "C:\\Swathi-QA\\Drivers\\Firefox-Gecko\\safaridriver.exe");
		driver = new SafariDriver();
		break;

	default:
		System.out.println("Invalid");
	}
    }
 public void FkLaunch()
 {
	 driver.get("https://flipkart.com");
 }

 public void linkcount()
 {
	List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	System.out.println("num of links:"+allLinks.size());
	
	for (int i =0; i<allLinks.size(); i++)
	{
		System.out.println(allLinks.get(i).getText());
		System.out.println(allLinks.get(i).getAttribute("href"));
	}
 }

 public static void main(String[] args) 
	{
		Assignment3 obj = new Assignment3();
		obj.launchBrowser("chrome");
		obj.FkLaunch();
		obj.linkcount();
	}
}
