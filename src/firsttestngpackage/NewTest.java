package firsttestngpackage;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
  public String baseUrl="http://newtours.demoaut.com";
  public WebDriver driver;
  
	
	@BeforeTest
  public void setBaseUrl() {
		driver=new FirefoxDriver();
		driver.get(baseUrl);
  }
	@Test
	public void verifyHomePageTitle() throws InterruptedException{
		String expectedTitle="Welcome: Mercury Tours";
		Thread.sleep(5000);
		String actualTitle=driver.getTitle();
		AssertJUnit.assertEquals(actualTitle, expectedTitle);
	}
	@AfterTest
	public void endSession(){
		driver.quit();
	}
	
}
