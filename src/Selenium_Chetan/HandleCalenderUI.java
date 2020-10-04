package Selenium_Chetan;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalenderUI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Material\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().fullscreen();
		WebElement travelDate = driver.findElement(By.id("travel_date"));	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", travelDate); 
		driver.findElement(By.id("travel_date")).click();
		
		WebElement Month = driver
				.findElement(By.xpath("//*[@class='datepicker-days']//th[@class='datepicker-switch']"));
		System.out.println(Month.getText());
		while (!(Month.getText().equalsIgnoreCase("May 2020"))) {
			driver.findElement(By.xpath("//*[@class='datepicker-days'] //th[@class='next']")).click();
			;
		}

		List<WebElement> days = driver.findElements(By.className("day"));
		for (int i = 0; i < days.size(); i++) {
			String daytoselect = days.get(i).getText();
			if (daytoselect.equalsIgnoreCase("15")) {
				days.get(i).click();
				break;
			}
		}

		driver.close();
	}

}
