package SeleniumHomeWork;
// homework
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Assignment1 {

	public static void main(String[] args) {
	
		System.setProperty("WebDriver.gecko.driver", "C:\\Swathi-QA\\Drivers\\Firefox-Gecko\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.vitscc.com/");

		String title = driver.getTitle();

		if (title.matches("VITS HR")) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		//Assert.assertEquals(title, "VITS HR");
		
		driver.get("https://www.facebook.com/");
		driver.navigate().back();
		
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		driver.navigate().refresh(); //To Reload
		driver.close();
	

	}

}
