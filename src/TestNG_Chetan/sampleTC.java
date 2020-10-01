package TestNG_Chetan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sampleTC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver 	driver = new ChromeDriver();	
		driver.get("https://www.phptravels.net/home");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@class='mini-menu']//ul//li[1]")).click();

		String a=driver.findElement(By.xpath("//*[@class='mini-menu']//ul//li[1]")).getText();
	System.out.println(a);
	}

}
