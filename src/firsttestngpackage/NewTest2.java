package firsttestngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest2 {
  public String baseUrl="https://www.google.co.in/";
  public WebDriver driver=new FirefoxDriver();
  public String expected=null;
  public String actual=null;
  
  @BeforeTest
  public void launchBrowser(){
	  driver.get(baseUrl);
  }
  @BeforeMethod
  public void verifyHomePageTitle() throws InterruptedException{
	  //expected="Welcome: Mercury Tours";
	  //actual=driver.getTitle();
	 // Assert.assertEquals(actual,expected);
	  driver.findElement(By.xpath("//*[contains(@value,'Feeling Lucky')]")).click();
	  expected="Google Doodles";
	  Thread.sleep(5000);
	  actual=driver.getTitle();
	  
	  //driver.findElement(By.xpath("//*[contains(@href,'doodles#archive')]")).click();
	  Assert.assertEquals(actual, expected, "found");
  }
	@Test
	  public void register() {
  
		
  
  
//*[contains(@href,'doodles#archive')]
  //Assert.assertEquals(actual, expected);
	}
	@AfterMethod
	public void goBackToHomePage(){
		//driver.findElement(By.linkText("Home")).click();
	}
	
	@AfterTest
	public void terminateBrowser(){
		//driver.quit();
	}
}
