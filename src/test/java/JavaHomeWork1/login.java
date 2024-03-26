package JavaHomeWork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class login {

	public static void main(String[] args) {
		System.setProperty("WerbDriver.ChromeDriver", "C:\\Swathi-QA\\Drivers\\Chrome\\ChromeDriver\\chromedriver-win64\\ChromeDriver.exe");
		ChromeOptions CO = new ChromeOptions();
		CO.setBinary("C:\\Swathi-QA\\Drivers\\Chrome\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.fb.com/");
		
		//Webelement1=======
		WebElement unm = driver.findElement(By.name("email"));
		
		//Webelement2====
		WebElement pswd = driver.findElement(By.name("pass"));
	
		//Webelement3======
		WebElement login = driver.findElement(By.name("login"));
		
		
		unm.click();
		unm.sendKeys("aaa");
		pswd.click();
		pswd.sendKeys("bbb");
		login.click();

	}

}
