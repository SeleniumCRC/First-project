package Selenium_Chetan;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauveLabTests {
	
	
		public static final String USERNAME = "18che";

		  public static final String ACCESS_KEY = "12b4d251-ee4b-4bc5-96fd-e651a01ec9f0";

		  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";



		public static void main(String[] args) throws MalformedURLException {

		// TODO Auto-generated method stub



		DesiredCapabilities caps = DesiredCapabilities.chrome();

		caps.setCapability("platform", "Windows 7");

		caps.setCapability("version", "51.0");

		WebDriver driver=new RemoteWebDriver(new java.net.URL(URL), caps);

		driver.get("http://google.com");

		System.out.println(driver.getTitle());

		}



		
}
