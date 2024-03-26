package TestNgPractice;

import org.testng.annotations.Test;

public class DependsonGroups 
{
  @Test (groups = {"Group1"})
  public void TC1()
  {
	  System.out.println("TC1");
  }
  
  @Test (groups = {"Group2"})
  public void TC2()
  {
	  System.out.println("TC2");
  }
 
}
