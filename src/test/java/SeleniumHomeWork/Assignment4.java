package SeleniumHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Assignment4 {
WebDriver driver;

public void LaunchBrowser(String Browser)
{
	switch (Browser)
	{
	case "chrome":
		System.setProperty("webdriver.chromedriver","C:\\Swathi-QA\\Drivers\\Chrome\\chrome-win64\\chromedriver.exe");
		ChromeOptions CO = new ChromeOptions();
		CO.setBinary("C:\\Swathi-QA\\Drivers\\Chrome\\ChromeDriver\\chromedriver-win64\\chrome.exe");
		driver = new ChromeDriver();
		break;
		
	case "Firefox":
		System.setProperty("webdriver.gecko.driver", "C:\\Swathi-QA\\Drivers\\Firefox-Gecko\\geckodriver.exe");
		driver = new FirefoxDriver();
	    break;
	    
	default:
		System.out.println("Invalid");
	}	
}
public void Ebay()
{
	driver.get("https://ebay.com/");
	WebElement Search = driver.findElement(By.xpath("//input[@placeholder='Search for anything']"));
	Search.sendKeys("gardening");
	Search.click();
	
	WebElement ctg = driver.findElement(By.xpath("//select[@id='gh-cat']"));
	Select s = new Select(ctg);
	s.selectByVisibleText("Books");
	
	WebElement Submit = driver.findElement(By.xpath("//input[@type='submit']"));
	Submit.click();
}
	public static void main(String[] args) {
	//Create obj for class
		Assignment4 obj = new Assignment4();
		obj.LaunchBrowser("chrome");
		obj.Ebay();
		
		

	}

}
