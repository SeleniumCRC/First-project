package Selenium_Chetan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class udemyAssignmentTwo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Set System property
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Material\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Launch url
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		int totaolCheckbox = driver.findElements(By.xpath("//*[@type='checkbox']")).size();
		System.out.println("Count of number of check boxes " + totaolCheckbox);

		driver.close();

	}
}
