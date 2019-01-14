package example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	String driverPath = "C:\\Selenium\\chromedriver.exe";
	public WebDriver driver;

	@Test
	public void f() {
		System.out.println("Test executed");
	}

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}

//	@AfterClass
//	public void afterClass() {
//	}

}
