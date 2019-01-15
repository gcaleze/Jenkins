package mainSample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class base {
	String driverPath;
	public WebDriver driver;

	@BeforeClass
	public void launchBrowser() {
		locateDriver();
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String OS = System.getProperty("os.name");
		System.out.println(OS);
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
