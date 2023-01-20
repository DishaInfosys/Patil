package DDF;

import java.io.FileInputStream;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demo.actitime.com/login.do");
	
	//enter UN
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin",Keys.TAB,"Manager",Keys.ENTER);
	String actT = driver.getTitle();
	System.out.println(actT);
	/*string expT="";
	if(actT.equals(expT)) {
		System.out.println("TC is Pass");
	}
	else {
		System.out.println("TC is fail");
	} */
	
	
	}

}
