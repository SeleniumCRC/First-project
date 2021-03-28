package Selenium_Chetan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteDropdownAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Material\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		WebElement searchBox = driver.findElement(By.xpath("//*[@id='autocomplete']"));
		searchBox.sendKeys("IND");
		Thread.sleep(6000);
		List<WebElement> listItems = driver.findElements(By.xpath("//*[@class='ui-menu-item-wrapper']"));
		System.out.println("Number of items in the dropdown list are :" + listItems.size());
		for (int i = 0; i < listItems.size(); i++) {

			searchBox.sendKeys(Keys.DOWN);
			if (listItems.get(i).getText().equalsIgnoreCase("India")) {
				System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
				break;
			}

		}
		driver.close();

	}

}
