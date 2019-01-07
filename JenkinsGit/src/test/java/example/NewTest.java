package example;		
	
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;	
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class NewTest {		
	private WebDriver driver;
	String driverPath = "C:\\Selenium\\chromedriver.exe";	
	    
		@BeforeTest
		public void beforeTest() {	
			System.setProperty("webdriver.chrome.driver", driverPath);	//for Chorme
			driver = new ChromeDriver(); 
		}	
		
		@Test				
		public void testEasy() {	
			driver.get("http://demo.guru99.com/test/guru99home/");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
			System.out.println("Oyeeeee!!!!");
		}		
		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}