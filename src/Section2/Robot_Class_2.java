package Section2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_Class_2 {
	 public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		//open the application
		driver.get("https://gaana.com/");
		//create object of robot class
		Robot r=new Robot();
		//press key
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		//RELEASE KEY
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(4000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(4000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
	}

}
