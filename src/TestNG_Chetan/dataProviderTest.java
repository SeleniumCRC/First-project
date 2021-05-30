package TestNG_Chetan;

	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.Test;
	import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class dataProviderTest {
		
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
		@Test(groups = {"Sanity"}, dataProvider="testdata")
		public void ab(String a, String b)
		{
			System.out.println(a);
			System.out.println(b);
			System.out.println("ab sanity test");
		}
		@Test(groups = {"Smoke"})
		public void don()
		{
			System.out.println("In Don smoke method");
		}
		@DataProvider
		public Object[][] testdata()
		{
			Object[][] a = new Object[2][2];
			
			for(int i =0; i<2;i++)
			{
				a[i][0] = "Hi";
				a[i][1] = "Dear";
			}
			return a;
			
		}
		@AfterMethod
		public void tearDown()
		{
			System.out.println("in close method");	
		}

	}

