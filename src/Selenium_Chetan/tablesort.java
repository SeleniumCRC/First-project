package Selenium_Chetan;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class tablesort {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver_win32 (3)\\chromedriver.exe");
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions option = new ChromeOptions();
		option.merge(dc);

		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/offers");

		List<WebElement> column = driver.findElements(By.xpath("//*[@id='sortableTable']//td[2]"));
		
		ArrayList<String> originalList = new ArrayList<>();
		for (int i = 0; i < column.size(); i++) {
			originalList.add(column.get(i).getText());
		}
		ArrayList<String> copiedList = new ArrayList<>();
		for (int i = 0; i < originalList.size(); i++) {
			copiedList.add(originalList.get(i));
		}
		
		for(String s : originalList)
		{
			System.out.println(s);
		}
		
		System.out.println("********************************************");
		Collections.sort(copiedList);
		
		for(String s : copiedList)
		{
			System.out.println(s);
		}
		//AssertTrue(originalList.equals(copiedList));
		Collections.reverse(copiedList);
		System.out.println("********************************************");
		
		for(String s : copiedList)
		{
			System.out.println(s);
		}
		
		driver.close();

	}
}
