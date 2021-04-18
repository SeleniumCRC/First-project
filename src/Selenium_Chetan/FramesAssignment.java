package Selenium_Chetan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Material\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Nested Frames")).click();
		int count =driver.findElements(By.tagName("frameset")).size();
		System.out.println(count);
		
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		driver.switchTo().parentFrame();
		
		System.out.println(driver.getTitle());
		//String tittlFrame = driver.findElement(By.xpath("//*[@id='content']")).getText();
		//System.out.println(tittlFrame);
		driver.close();
	}

}
