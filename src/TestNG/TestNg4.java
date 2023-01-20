package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNg4 {
@Test
public void tc1() {
	Reporter.log("from TC1 IT is fail",true);
	Assert.fail();
}
@Test
public void tc2() {
	Reporter.log("from TC2 IT is fail",true);
	Assert.fail();
}
@Test
public void tc3() {
	Reporter.log("from TC3 IT is fail",true);
	Assert.fail();
}
@Test
public void tc4() {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demo.actitime.com/login.do");
	Reporter.log("from TC4 IT is fail",true);
	Assert.fail();
}





}
