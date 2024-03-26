package SeleniumHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment7 {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chromedriver","C:\\Swathi-QA\\Drivers\\Chrome\\chrome-win64\\chromedriver.exe");
//		ChromeOptions CO = new ChromeOptions();
//		CO.setBinary("C:\\Swathi-QA\\Drivers\\Chrome\\ChromeDriver\\chromedriver-win64\\chrome.exe");
//		WebDriver driver = new ChromeDriver();
//		
		System.setProperty("WebDriver.gecko.driver", "C:\\Swathi-QA\\Drivers\\Firefox-Gecko\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.gmail.com");
		
		WebElement email = driver.findElement(By.name("identifier"));
		email.sendKeys("swathikaparthi8");
		email.click();
		
		WebElement next = driver.findElement(By.id("identifierNext"));
		next.click();
		Thread.sleep(5000);
		
		WebElement pswd = driver.findElement(By.xpath("//input[@type='password']"));
		//pswd.click();
		pswd.sendKeys("AAA123!");
		pswd.click();
	}

}
