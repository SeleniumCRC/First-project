package Selenium_Chetan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildRelationshipAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Material\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement  searchBox = driver.findElement(By.xpath("//*[@class='RNNXgb']/div/div[2]/input[contains(@title,'Search')]"));
		searchBox.sendKeys("Sayali Happy anniversary");
		Thread.sleep(2000);
		driver.close();
	}

}
