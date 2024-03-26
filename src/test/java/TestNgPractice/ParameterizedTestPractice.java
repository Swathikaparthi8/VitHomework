package TestNgPractice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTestPractice {

  @Test
  @Parameters("Browser")
  public void Launch(String Browser) 
  {
	  if (Browser.equals("Chrome"))
	  {
		  System.out.println("Launced Chrome");
	  }
	  else if (Browser.equals("FireFox"))
	  {
		  System.out.println("Launched Firefox");
	  }
  }
}
