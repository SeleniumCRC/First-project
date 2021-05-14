package Selenium_Chetan;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class udemyAssignmentOne {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Chetan Folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		// Launch url
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		WebElement checkBox1 = driver.findElement(By.xpath("//*[@id='checkBoxOption1']"));
		Dimension d = checkBox1.getSize();
		System.out.println(d.width);
		System.out.println(d.height);
		Point p= checkBox1.getLocation();
		System.out.println(p.x+"  and "+p.y);
		
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
