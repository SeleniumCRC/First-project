package Selenium_Chetan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableAssignment {

	public static void main(String[] args) throws FileNotFoundException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Chetan Folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement table = driver.findElement(By.xpath("//*[@class='table-display']"));
		int rowount = table.findElements(By.xpath("//*[@name='courses']/tbody/tr")).size();
		System.out.println("Non of rows" + rowount);
		int columCount = table.findElements(By.xpath("//*[@id='product']/tbody/tr/th")).size();
		System.out.println("Non of columns" + columCount);
		
		String path = "E:\\Selenium\\Chetan Folder\\First-projectwebTableToExcel.xlsx";
		ReadExcelFile file = new ReadExcelFile(path);
		
		
		
		for (int i = 2; i <=rowount; i++) {

			String instructor = "//*[@name='courses']/tbody/tr[" + i + "]//td[1]";
			System.out.println(table.findElement(By.xpath(instructor)).getText());
			//file.setData("a", i, 0, instructor);

			String course = "//*[@name='courses']/tbody/tr[" + i + "]//td[2]";
			System.out.println(table.findElement(By.xpath(course)).getText());

			String price = "//*[@name='courses']/tbody/tr[" + i + "]//td[3]";
			System.out.println(table.findElement(By.xpath(price)).getText());
			
			//file.writeFile(path);
		}
		

		driver.close();

	}

}
