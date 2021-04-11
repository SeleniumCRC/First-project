package Selenium_Chetan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class sachinProblem {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Material\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/index.php");
		WebElement myAccount = driver.findElement(By.xpath("//*[@class ='nav pull-right']/ul/li[2]/a"));

		myAccount.click();
		WebElement login = driver.findElement(By.xpath("//*[@class ='nav pull-right']/ul/li[2]/ul/li[2]/a"));
		login.click();

		WebElement email = driver.findElement(By.xpath("//*[@name='email']"));
		WebElement password = driver.findElement(By.xpath("//*[@name='password']"));
		email.sendKeys("cba@gmail.com");
		password.sendKeys("Abc@123");
		WebElement loginButton = driver.findElement(
				By.xpath("//*[@action='http://tutorialsninja.com/demo/index.php?route=account/login']/input"));
		loginButton.click();
		Assert.assertEquals(driver.getTitle(), "My Account");

		WebElement homeButton = driver.findElement(By.xpath("//*[@id='account-account']/ul/li[1]/a"));
		homeButton.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//*[@id='content']/h3")));
		// js.executeScript("window.scrollBy(0,700)");
		/*
		 * Get the Label and associated Price of those item. Fetch them and sort
		 * it as per their price [Low to High] and print it on Console [Label
		 * and Price]
		 */

		int countOfProducts = driver.findElements(By.xpath("//*[@id='content']/div[2]/div")).size();
		System.out.println(countOfProducts);

		List<WebElement> producLabel = driver.findElements(By.xpath("//*[@id='content']/div[2]/div/div/div/h4"));
		ArrayList<String> actualProductList = new ArrayList<String>();
		for (WebElement e : producLabel) {
			System.out.println("The product label is :" + e.getText());
			actualProductList.add(e.getText());
		}

		List<WebElement> pricelist = driver.findElements(By.xpath("//*[@id='content']/div[2]/div/div/div/p[2]"));
		ArrayList<Double> actualPriceList = new ArrayList<Double>();

		for (WebElement e : pricelist) {
			// System.out.println("The product list is :"+e.getText() );
			String price = e.getText();
			String priceActual[] = price.split("\\s");
			String associatedPrice = priceActual[0].substring(1);
			double associatedPricel = Double.parseDouble(associatedPrice);
			actualPriceList.add(associatedPricel);
			System.out.println(associatedPrice);
		}

		HashMap<Double, String> productwithPrice = new HashMap<Double, String>();
		for (int i = 0; i < pricelist.size(); i++) {
			productwithPrice.put(actualPriceList.get(i), actualProductList.get(i));
		}
		Map<Double, String> map = new TreeMap<Double, String>(productwithPrice);
		Set set = productwithPrice.entrySet();

		Iterator iterator = set.iterator();

		for (Map.Entry entry : productwithPrice.entrySet()) {
			System.out.println(entry.getValue()+":"+entry.getKey()
			);
		}

		
		WebElement laptopNotepad = driver.findElement(By.xpath("//*[text()='Laptops & Notebooks']"));
		js.executeScript("arguments[0].scrollIntoView();", laptopNotepad);
		Actions action = new Actions(driver);
		
		action.moveToElement(laptopNotepad);
		laptopNotepad.click();
		driver.findElement(By.xpath("//*[text()='Show All Laptops & Notebooks']")).click();
		WebElement sortBy = driver.findElement(By.xpath("//*[@id='input-sort']"));
		
		Select select = new Select(sortBy);
		select.selectByVisibleText("Price (High > Low)");
		
		WebElement item = driver.findElement(By.xpath("//*[@href='http://tutorialsninja.com/demo/index.php?route=product/product&path=18&product_id=45&sort=p.price&order=DESC']"));
		//js.executeScript("arguments[0].scrollIntoView();", item);
		js.executeScript("window.scrollBy(0,400)");
		item.sendKeys(Keys.ENTER);
		WebElement qty = driver.findElement(By.xpath("//*[@id='input-quantity']"));
		qty.clear();
		qty.sendKeys("2");
		
		WebElement addTocart = driver.findElement(By.xpath("//*[text()='Add to Cart']"));
		js.executeScript("window.scrollBy(0,40)");
		addTocart.sendKeys(Keys.ENTER);
				
		WebElement cart =driver.findElement(By.xpath("//*[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']"));
		cart.click();
		WebElement productName = driver.findElement(By.xpath("//*[@class='text-left']"));
		System.out.println(productName.getText());
		Thread.sleep(2000);
		driver.close();

	}

}
