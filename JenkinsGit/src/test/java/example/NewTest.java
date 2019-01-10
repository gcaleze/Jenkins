package example;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.remote.RemoteWebDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class NewTest {
	private ExtentHtmlReporter reporter;
	private ExtentReports extent;
	String driverPath = "\\var\\Drivers\\chromedriver.exe";
	public WebDriver driver;
	public String expected = null;
	public String actual = null;

	@BeforeClass // -------------------------------------------------------
	public void launchBrowser() throws MalformedURLException {
		System.out.println("launching Chrome browser");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
	driver.get("https://www.google.com/");
//		WebDriver driver = new RemoteWebDriver(new URL("http://34.204.52.158:8080"), DesiredCapabilities.chrome());
//		driver.get("http://www.google.com");
//		DesiredCapabilities capability = DesiredCapabilities.chrome();
//		driver = new RemoteWebDriver(new URL("http://34.204.52.158:8080"), capability);
//		driver.get("https://www.google.com/");
//		String page = driver.getPageSource();
	}

	@Test(priority = 1)
	public void test1() {
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("qwerty");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.RETURN);
	}

	@Test(priority = 2)
	public void test2() {
		reporter = new ExtentHtmlReporter("./Reports/Report.html");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest logger = extent.createTest("sampleGenReports");
		logger.log(Status.INFO, "Info 1");
		logger.log(Status.PASS, "Pass 2");
		logger.log(Status.DEBUG, "Debug 3");
		logger.log(Status.ERROR, "Error 4");
		logger.log(Status.FAIL, "Fail 5");
		logger.log(Status.SKIP, "Skip 6");
		logger.log(Status.WARNING, "Warning 7");
		logger.log(Status.FATAL, "Fatal 7.5");
		logger.debug("Debug 8");
		logger.error("Error 9");
		logger.fail("Fail 10");
		logger.fatal("Fatal 11");
		logger.info("Info 12");
		logger.pass("Pass 13");
		logger.skip("Skip 14");
		logger.warning("Warning 15");
		extent.flush();
		System.out.println("1.1");
	}

	@Test(priority = 3)
	public void test3() {
		ExtentTest logger2 = extent.createTest("sample Gen Reports");
		logger2.log(Status.INFO, "Info 1.1");
		logger2.log(Status.PASS, "Pass 2.1");
		logger2.log(Status.DEBUG, "Debug 3.1");
		logger2.log(Status.ERROR, "Error 4.1");
		logger2.log(Status.FAIL, "Fail 5.1");
		logger2.log(Status.SKIP, "Skip 6.1");
		logger2.log(Status.WARNING, "Warning 7.1");
		logger2.log(Status.FATAL, "Fatal 7.5.1");
		logger2.debug("Debug 8.1");
		logger2.error("Error 9.1");
		logger2.fail("Fail 10.1");
		logger2.fatal("Fatal 11.1");
		logger2.info("Info 12.1");
		logger2.pass("Pass 13.1");
		logger2.skip("Skip 14.1");
		logger2.warning("Warning 15.1");

		extent.flush();
		System.out.println("2.1");
	}
}
