package SeleniumHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.Assert;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.ChromeDriver", "C:\\Swathi-QA\\Drivers\\Chrome\\chrome-win64\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.setBinary("C:\\Swathi-QA\\Drivers\\Chrome\\ChromeDriver\\chromedriver-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver();
		

		
		
		driver.get("http://jqueryui.com/droppable/");
		
		///Actions class---------
		Actions ac = new Actions(driver);// driver here as driver performs the actions
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame); /// driver moves to this frame
		
		WebElement drg = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drp = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		
		int x = drg.getLocation().getX();
		int y = drp.getLocation().getY();
		System.out.println("x and y coordinates : "+x+","+y); 
		
//		ac.dragAndDropBy(drg, x, y).perform();
		ac.dragAndDropBy(drg, 151, 45).perform(); /// only these coordinate nums are working

		Thread.sleep(5000);
		
		WebElement drpped = driver.findElement(By.xpath("//div[@id='droppable']/p"));
		String D= drpped.getText();
		
		Assert.assertEquals("Dropped!", D);
		
		
		//Verify color using CssValue and Color class
		WebElement C= driver.findElement(By.xpath("//div[@id='droppable']/p"));
		String S = C.getCssValue("color");
		String cl = Color.fromString(S).asHex();
		
		System.out.println("Color is:" +S);		
		System.out.println("Color code is:" +cl);
		
		Assert.assertEquals(S,"rgba(119, 118, 32, 1)");
		
	}

}
