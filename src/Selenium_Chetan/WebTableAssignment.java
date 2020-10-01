package Selenium_Chetan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Material\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement table =driver.findElement(By.xpath("//*[@class='table-display']"));
		int rowount =table.findElements(By.xpath("//*[@id='product']//tr")).size();
		System.out.println("Non of rows"+rowount);
		int columCount = table.findElements(By.xpath("//*[@id='product']//tr//th")).size();
		System.out.println("Non of rows"+columCount);
		
		for(int i=1;i<=rowount;i++)
		{
			for(int j=1;j<=columCount;j++)
			{
				//for second record
				if(i==3)
				{
					String customXpath = "//*[@id='product']//tr["+i+"]//td["+j+"]";
					System.out.println(table.findElement(By.xpath(customXpath)).getText());
				
				}
			}
			
		}
		
		driver.close();
		
		
	}

}
