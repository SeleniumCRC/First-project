package Selenium_Chetan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class naveen_Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Chetan Folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.worldometers.info/world-population/");
		long start_time = System.currentTimeMillis();
		long wait_time = 10000;
		long end_time = start_time + wait_time;
		while (System.currentTimeMillis() < end_time) {
			WebElement currentWorldPopulationText = driver
					.findElement(By.xpath("//*[contains(text() , 'Current World Population')]"));
			System.out.print(currentWorldPopulationText.getText() + ":");
			WebElement currentWorldPopulationTextCount = driver
					.findElement(By.xpath("//*[@class='maincounter-number']"));
			System.out.println(currentWorldPopulationTextCount.getText());
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("Birth Today");
			System.out.println("Birts today :" + driver.findElement(By.xpath("//*[@rel='births_today']")).getText());
			System.out.println("Deaths today :" + driver.findElement(By.xpath("//*[@rel='dth1s_today']")).getText());
			System.out.println(
					"Polution Growth today :" + driver.findElement(By.xpath("//*[@rel='absolute_growth']")).getText());
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("THIS YEAR");
			System.out.println(
					"Birts this year :" + driver.findElement(By.xpath("//*[@rel='births_this_year']")).getText());
			System.out.println(
					"Deaths this year :" + driver.findElement(By.xpath("//*[@rel='dth1s_this_year']")).getText());
			System.out.println("Polution this year :"
					+ driver.findElement(By.xpath("//*[@rel='absolute_growth_year']")).getText());

		}
		
		driver.close();
	}

}
