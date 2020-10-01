package Selenium_Chetan;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DownloadfileLocVerify {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		String downloadPath = System.getProperty("user.dir");
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

chromePrefs.put("profile.default_content_settings.popups", 0);

chromePrefs.put("download.default_directory", downloadPath);

ChromeOptions options=new ChromeOptions();

options.setExperimentalOption("prefs", chromePrefs);

System.setProperty("webdriver.chrome.driver", "E:\\Selenium Material\\chromedriver_win32\\chromedriver.exe");

WebDriver driver = new ChromeDriver(options);

driver.get("https://altoconvertpdftojpg.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.id("dropzoneInput-label")).click();
		Thread.sleep(10000);
		Runtime.getRuntime().exec("E:\\Selenium Material\\ex.exe");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='cookies-popup cookies-popup--default']/div/button")));
		driver.findElement(By.xpath("//*[@class='cookies-popup cookies-popup--default']/div/button")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='g-btn g-btn--primary g-btn--medium']")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class*='medium']")));
		
		driver.findElement(By.cssSelector("button[class*='medium']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Download Now")));

		driver.findElement(By.linkText("Download Now")).click();
		Thread.sleep(5000);
		File f = new File(downloadPath+"/Result.zip");
		if(f.exists()) {
			System.out.println("file found");
		}
		
		driver.close();
	}

}
