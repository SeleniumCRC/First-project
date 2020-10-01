package Selenium_Chetan;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentSynchronization {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.manage().window().maximize();
		

	WebDriverWait wait = new WebDriverWait(driver, 5);
	driver.findElement(By.linkText("Click to load get data via Ajax!")).click();;
	WebElement result = driver.findElement(By.xpath("//*[@id='results']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='results']")));
	System.out.println(result.getText());
	driver.close();
	}
}