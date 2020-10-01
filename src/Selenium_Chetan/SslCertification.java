package Selenium_Chetan;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SslCertification {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Material\\chromedriver_win32\\chromedriver.exe");
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions option = new ChromeOptions();
		option.merge(dc);

		WebDriver driver = new ChromeDriver(option);

		driver.get("https://www.google.com");
		driver.close();

	}

}
