package Selenium_Chetan;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Material\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		WebElement checkBox1 = driver.findElement(By.xpath("//*[@id='checkBoxOption1']"));
		String checkBoxName = checkBox1.getAttribute("value");
		System.out.println(checkBoxName);
		checkBox1.click();

		WebElement dropDown = driver.findElement(By.id("dropdown-class-example"));
		Select select = new Select(dropDown);
		List<WebElement> dropdownList = select.getOptions();
		// Iterator<WebElement> itr = dropdownList.iterator();
		System.out.println(dropdownList.size());

		for (int i = 0; i < dropdownList.size(); i++) {
			String option = dropdownList.get(i).getText();
			if (option.equalsIgnoreCase(checkBoxName)) {
				select.selectByVisibleText(option);
				break;
			}
		}

		WebElement editBox = driver.findElement(By.xpath("//*[@id='name']"));
		editBox.sendKeys(checkBoxName);
		WebElement alertButton = driver.findElement(By.xpath("//*[@id='alertbtn']"));
		alertButton.click();

		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println(alertText);
		// Hello option1, share this practice page and share your knowledge
		if (alertText.contains(checkBoxName)) {
			System.out.println("Pass. Checkbox text is present on alert pop up");
		} else {

			System.out.println("Fail.Checkbox text not is present on alert pop up");

		}
		alert.dismiss();
		driver.close();

	}

}
