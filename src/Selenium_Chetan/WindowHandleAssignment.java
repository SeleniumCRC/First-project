package Selenium_Chetan;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Material\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		String parentwindow = driver.getWindowHandle();
		Set<String> win = driver.getWindowHandles();
		System.out.println(win.size());
		Iterator<String> itr = win.iterator();
		while (itr.hasNext()) {
			if (parentwindow.equalsIgnoreCase(itr.next())) {
				driver.switchTo().window(itr.next());
				break;
			}
			System.out.println(itr.next());
		}

		String childWindowTittle = driver.getTitle();
		System.out.println(childWindowTittle);

		driver.switchTo().window(parentwindow);

		String ParentWindowTittle = driver.getTitle();
		System.out.println(ParentWindowTittle);

		driver.quit();
	}

}
