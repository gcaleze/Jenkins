package mainSample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class base {
	String driverPath = "C:\\Selenium\\chromedriver.exe";
	//String driverPath = "/usr/bin/chromedriver";	
	public WebDriver driver;

	@BeforeClass
	public void launchBrowser(){
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String OS = System.getProperty("os.name");
		System.out.println(OS);
	}
	
//	public String checkOS(){
//		String OS = System.getProperty("os.name");
//		return OS;
//	}
}
