package TestNG_Chetan;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class priorityTest {
	
	//WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		//System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Chetan Folder\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();		
		//driver.get("https://www.phptravels.net/home");
	}
	@Parameters({"username"})
	@Test(priority =0)
	public void atTest(String uname)
	{
		System.out.println(uname);
		System.out.println("In the test");
	}
	@Test(priority=1)
	public void ab()
	{
		System.out.println("ab test");
	}
	@Test
	public void don()
	{
		System.out.println("In Don method");
	}
	
	@AfterMethod
	public void tearDown()
	{
		//driver.close();	
	}

}
