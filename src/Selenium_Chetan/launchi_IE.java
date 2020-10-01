package Selenium_Chetan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class launchi_IE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.ie.driver", "E:\\Selenium Material\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com");
		driver.close();
		driver.quit();
	}

}
