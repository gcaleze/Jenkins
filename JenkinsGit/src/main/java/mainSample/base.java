package mainSample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class base {
	String driverPath;
	public WebDriver driver;

	@BeforeClass
	public void launchBrowser(){
		locateChromeDriver();
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String OS = System.getProperty("os.name");
		System.out.println(OS);
	}
	
	public void locateChromeDriver(){
		String OS = System.getProperty("os.name");
		if (OS.equals("Windows 7")){
			driverPath = "C:\\Selenium\\chromedriver.exe";
		}else {
			driverPath = "/usr/bin/chromedriver";
		}
	}
}
