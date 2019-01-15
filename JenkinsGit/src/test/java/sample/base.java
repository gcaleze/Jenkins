package sample;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class base {
	String driverPath;
	public WebDriver driver;

	@BeforeClass
	public void launchBrowser() throws Exception {
//		locateDriver();
//		System.setProperty("webdriver.chrome.driver", driverPath);
//		driver = new ChromeDriver();
//		driver.get("https://www.google.com/");

		DesiredCapabilities capability = DesiredCapabilities.chrome();
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.125.97:4444/wd/hub"), capability);
		driver.get("http://www.google.com");
	}

	public void locateDriver() {
		String OS = System.getProperty("os.name");
		System.out.println("locateDriver()");
		if (OS.equals("Windows 7")) {
			driverPath = "C:\\Selenium\\chromedriver.exe";
			System.out.println("Windows 7");
		} else {
			System.out.println("Other OS");
			driverPath = "/usr/bin/chromedriver";
		}
	}
}
