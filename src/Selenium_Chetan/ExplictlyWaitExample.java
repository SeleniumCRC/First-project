package Selenium_Chetan;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplictlyWaitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> itemToAddCart = new ArrayList<>();

		itemToAddCart.add("Cucumber");
		itemToAddCart.add("Brocolli");
		itemToAddCart.add("Cashews");
		itemToAddCart.add("Pista");
		itemToAddCart.add("Cauliflower");

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Material\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		List<WebElement> product = driver.findElements(By.xpath("//*[@class='product']//h4"));
		int j = 1;
		for (int i = 0; i < product.size(); i++) {
			String productName = product.get(i).getText();
			String[] actualProductName = productName.split("\\s");
			// System.out.println(actualProductName[0]);
			// System.out.println(i);
			if (itemToAddCart.contains(actualProductName[0]))// actualProductName[0].equals("Cucumber"))
			{
				j++;
				driver.findElements(By.xpath("//*[@class='product-action']")).get(i).click();
				System.out.println(actualProductName[0]);
				if (j > itemToAddCart.size())
					break;
			}

		}

		driver.findElement(By.xpath("//*[@class='cart-icon']")).click();
		driver.findElement(By.xpath("//*[contains(text(),'PROCEED')]")).click();
		//Explicit wait implementation
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		driver.close();
	}

}
