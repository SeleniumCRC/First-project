package Selenium_Chetan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class launchGhostBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Chetan Folder\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless", "--window-size=1920,1200");
		//options.addArguments("wind-size-400,800");
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		WebElement searchBox = driver.findElement(By.xpath("//*[@class='gLFyf gsfi']"));
		searchBox.clear();
		searchBox.sendKeys("abc");
		WebElement searchButton = driver.findElement(By.xpath("//*[@class='FPdoLc lJ9FBc']/center/input[@class='gNO89b']"));
		searchButton.click();
		System.out.println(driver.getTitle());
		driver.close();
		
	}

}
