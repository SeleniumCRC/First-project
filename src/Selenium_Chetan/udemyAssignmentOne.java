package Selenium_Chetan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class udemyAssignmentOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Set System property
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium Material\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Launch url
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		WebElement checkBox1 = driver.findElement(By.xpath("//*[@id='checkBoxOption1']"));
		checkBox1.click();
		String checkBoxName = checkBox1.getText();
		System.out.println(checkBoxName);
		
		if (checkBox1.isSelected()) {
			System.out.println("The checkBox1 is selected");
		} else {
			System.out.println("The checkBox1 is not selected");
		}
		checkBox1.click();
		if (!checkBox1.isSelected()) {
			System.out.println("The checkBox1 is not selected");
		} else {
			System.out.println("The checkBox1 is  selected");
		}
		
		int total_num = driver.findElements(By.xpath("//*[contains(@name, 'checkBoxOption')]")).size();
		System.out.println("Total chekboxes"+total_num);
		driver.close();
	}

}
