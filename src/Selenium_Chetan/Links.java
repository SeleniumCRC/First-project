package Selenium_Chetan;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium Material\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		List<WebElement> frame = driver.findElements(By.tagName("iframe"));
		System.out.println(frame.size());

		System.out.println(driver.findElements(By.tagName("a")).size());

		WebElement footerlinks = driver.findElement(By.xpath("//*[@id='gf-BIG']"));
		System.out.println(footerlinks.findElements(By.tagName("a")).size());
		List<WebElement> totalLinks = footerlinks
				.findElements(By.xpath("//*[@id='gf-BIG']//table//tr//td[1]//ul//li//a"));
		System.out.println(totalLinks.size());

		for (int i = 0; i < totalLinks.size(); i++) {

			String openNewLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
			System.out.println(totalLinks.get(i).getText());
			totalLinks.get(i).sendKeys(openNewLink);

		}
		Set<String> childWindows = driver.getWindowHandles();

		Iterator<String> itr = childWindows.iterator();
		while (itr.hasNext()) {
			driver.switchTo().window(itr.next());
			System.out.println(driver.getTitle());
		}
		driver.close();

	}

}
