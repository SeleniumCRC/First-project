package Selenium_Chetan;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionSoft {

	
	public void f() throws MalformedURLException, IOException {
    System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Chetan Folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice");
		
		List<WebElement> links= driver.findElements(By.xpath("//*[@class='gf-li']//a"));
		System.out.println(links.size());
		SoftAssert softAssert = new SoftAssert();
		for(WebElement el : links)
		{
			String url = el.getAttribute("href");
			//System.out.println(url);
			
			HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
			con.setRequestMethod("HEAD");
			con.connect();
			int responseCode = con.getResponseCode();
			softAssert.assertTrue(responseCode<400, "The link with Text"+el.getText()+" is broken with code" +responseCode);
			/*if(responseCode>400)
			{
				System.out.println(el.getText()+": the link name and response code"+responseCode);
			
			}*/
		}
		driver.close();
		softAssert.assertAll();
		
	}

	}


