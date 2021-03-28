package Selenium_Chetan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchGoogleChrome {

	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Material\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String sourceCode =driver.getPageSource();
		System.out.println("Source code is" + sourceCode); 
		
		String tittle = driver.getTitle();
		String url = driver.getCurrentUrl();
		// log.error("The url should be same ");
		String source = driver.getPageSource();
		System.out.println("Url is" + url + "Tittle is" + tittle + "page source" + source);

		String handle = driver.getWindowHandle();
		System.out.println(handle);

		driver.close();

		//driver.navigate().to("https://www.google.com");

	}

}
