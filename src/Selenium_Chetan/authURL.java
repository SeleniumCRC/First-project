package Selenium_Chetan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class authURL {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Chetan Folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://admin:admin@the-internet.herokuapp.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Basic Auth")).click();
		driver.close();
		
}
}






