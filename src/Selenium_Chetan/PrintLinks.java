package Selenium_Chetan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Material\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice");
		
		List<WebElement>  links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		
		for(int i=0; i<links.size();i++)
		{	String seqence = Keys.chord(Keys.CONTROL, Keys.ENTER); 
			links.get(i).sendKeys(seqence);
			
		}
		driver.close();
		
		
	}

}
