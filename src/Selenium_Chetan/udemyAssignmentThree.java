package Selenium_Chetan;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class udemyAssignmentThree {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Chetan Folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		// Delete cookies
		driver.manage().deleteAllCookies();
		// Maximise the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement fromCity = driver.findElement(By.cssSelector("#FromTag"));
		WebElement toCity = driver.findElement(By.cssSelector("#ToTag"));

		fromCity.clear();
		fromCity.sendKeys("Pun");
		fromCity.sendKeys(Keys.ENTER);

		toCity.clear();
		toCity.sendKeys("mum");
		toCity.sendKeys(Keys.ENTER);
		driver.findElement(By.id("DepartDate")).click();
		WebElement departDate = driver
				.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active "));
		departDate.click();

		WebElement adults = driver.findElement(By.xpath("//*[@id='Adults']"));
		Select select = new Select(adults);
		select.selectByIndex(2);
		select.selectByVisibleText("5");
		

		String childrenHint = driver.findElement(By.xpath("//*[text()='2-11 yrs']")).getText();
		System.out.println(childrenHint);
		if (childrenHint.contains("2-11 yrs")) {
			System.out.println("Test case passed");
		} else {
			System.out.println("Test case not passedpassed");
		}

		String infantHint = driver.findElement(By.xpath("//*[text()='Below 2 yrs']")).getText();
		System.out.println(infantHint);
		if (infantHint.contains("2-11 yrs")) {
			System.out.println("Test case passed");
		} else {
			System.out.println("Test case not passedpassed");
		}

		WebElement children = driver.findElement(By.xpath("//*[@id='Childrens']"));
		Select sel = new Select(children);
		sel.selectByIndex(2);
		// driver.findElement(By.id("DepartDate")).click();
		/*
		 * WebElement departDate = driver .findElement(By.
		 * cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active "));
		 * departDate.click();
		 */
		driver.close();
	}

}
