package SeleniumHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.ChromeDriver", "C:\\Swathi-QA\\Drivers\\Chrome\\chrome-win64\\chromedriver.exe");
		ChromeOptions C = new ChromeOptions();
		C.setBinary("C:\\Swathi-QA\\Drivers\\Chrome\\ChromeDriver\\chromedriver-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.fb.com/");

		String URL = driver.getCurrentUrl();
		System.out.println("Current URL:" + URL);

		if (URL.matches("https://www.facebook.com")) {
			System.out.println("Correct");
		} else {
			System.out.println("Incorrect");
		}
		// Assert.assertEquals(URL, "http://www.facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		WebElement fnm = driver.findElement(By.name("firstname"));
		WebElement lnm = driver.findElement(By.name("lastname"));
		WebElement email = driver.findElement(By.name("reg_email__"));
		WebElement pswd = driver.findElement(By.id("password_step_input"));
	
		//Dropdown elements==========
		WebElement bm = driver.findElement(By.name("birthday_month"));
		Select s = new Select(bm);
		s.selectByIndex(9);
		Thread.sleep(500);
		
		WebElement bd = driver.findElement(By.name("birthday_day"));
		Select s1 = new Select(bd);
		s1.selectByValue("1");
		Thread.sleep(500);
		WebElement by = driver.findElement(By.name("birthday_year"));
		Select s2 = new Select(by);
		s2.selectByVisibleText("2010");
		
		WebElement Female = driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
		WebElement Signup = driver.findElement(By.name("websubmit"));
		//WebElement Remail = driver.findElement(By.name("email"));
		
		///find and right click on image
		WebElement Image = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		int x = Image.getLocation().getX();
		int y = Image.getLocation().getY();
		System.out.println(x+" "+y);
		
		Actions action = new Actions(driver);
		action.moveToElement(Image, 12, 176).contextClick().perform();
		
		///functions
		fnm.sendKeys("aaa");
		lnm.sendKeys("bbb");
		email.sendKeys("aaa@gmail.com");
		pswd.sendKeys("ababab");
		Female.click();
		Signup.click();
		driver.navigate().back();
		driver.navigate().forward();
		//Remail.sendKeys("aaa@gmail.com");
	
		
	}
}

