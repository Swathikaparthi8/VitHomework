package TestNgPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice 
{
	// This method takes data as input parameters. The attribute dataProvider is mapped to "getData" --->name of the dataProvider
  @Test (dataProvider = "getData")
  public void login(String usnm, String pswd)  // Number of columns should match the number of input parameters
  {
	  System.out.println("UserName is = "+usnm);
	  System.out.println("Paaword is = "+pswd);
  }
//If the name is not supplied, the data provider’s name automatically defaults to the method’s name.
  @DataProvider 
  public Object[][] getData()
  {
	  return new Object[][] // returns obj as method is not void
	 {
	  {"aaa", "a12"},
	  {"bbb", "b12"},
	  {"ccc", "c12"}
	 };
  }
  @Test (dataProvider = "getData1")
  public void login1(String uid, String pid)  // Number of columns should match the number of input parameters
  {
	  System.out.println("UserName is = "+uid);
	  System.out.println("Paaword is = "+pid);
  }
//If the name is not supplied, the data provider’s name automatically defaults to the method’s name.
  @DataProvider 
  public Object[][] getData1()
  {
	  return new Object[][] // returns obj as method is not void
	 {
	  {"A123", "Aa12"},
	  {"B123", "Bb12"},
	  {"C123", "Cc12"}
	 };
  }
}
