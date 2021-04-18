package Selenium_Chetan;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoItUploadFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "D:\\Selenium Material\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.get("https://altoconvertpdftojpg.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.id("dropzoneInput-label")).click();
		Thread.sleep(10000);
		Runtime.getRuntime().exec("D:\\Selenium Material\\ex.exe");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='cookies-popup cookies-popup--default']/div/button")));
		driver.findElement(By.xpath("//*[@class='cookies-popup cookies-popup--default']/div/button")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='g-btn g-btn--primary g-btn--medium']")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class*='medium']")));
		
		driver.findElement(By.cssSelector("button[class*='medium']")).click();

		driver.close();
	}

}
