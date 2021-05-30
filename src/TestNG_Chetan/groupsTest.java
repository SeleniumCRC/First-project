package TestNG_Chetan;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class groupsTest {
	
	//WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.out.println("set up method");
	}
	@Test(groups = {"Smoke"})
	public void atTest()
	{
		System.out.println("In the Smoke1");
	}
	@Test(groups = {"Sanity"})
	public void ab()
	{
		System.out.println("ab sanity test");
	}
	@Test(groups = {"Smoke"})
	public void don()
	{
		System.out.println("In Don smoke method");
	}
	
	@AfterMethod
	public void tearDown()
	{
		System.out.println("in close method");	
	}

}
