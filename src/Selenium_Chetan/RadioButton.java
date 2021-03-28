package Selenium_Chetan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args) {

		// Set System property
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Material\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Launch url
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		WebElement Header = driver.findElement(By.xpath("//*[text()=\"Radio Button Example\"]"));
		System.out.println(Header.getText());

		WebElement radio1 = driver.findElement(By.xpath("//*[@value=\"radio1\"]"));
		radio1.isDisplayed();
		radio1.isEnabled();
		if (!radio1.isSelected()) {
			radio1.click();
		}
		driver.quit();
	}

}
