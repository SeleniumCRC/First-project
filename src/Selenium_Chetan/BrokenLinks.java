package Selenium_Chetan;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Chetan Folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice");

		List<WebElement> links = driver.findElements(By.xpath("//*[@class='gf-li']//a"));
		System.out.println(links.size());

		for (WebElement el : links) {
			String url = el.getAttribute("href");
			// System.out.println(url);

			HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
			con.setRequestMethod("HEAD");
			con.connect();
			int responseCode = con.getResponseCode();
			if (responseCode > 400) {
				System.out.println(el.getText() + ": the link name and response code" + responseCode);
				break;
			}
		}
		driver.quit();
	}
}
