package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNg2 {
	@Test
	public void case1(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open the application
		driver.get("https://www.amazon.com/");
		Reporter.log("from TC1",true);
	}
	@Test
	public void case2(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver chr=new ChromeDriver();
		
		chr.get("https://www.amazon.com/");
		Reporter.log("from TC2",true);
		Assert.fail();
	}
	
}
