package Section2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_Class1 {
	public static void main(String[] args) throws Throwable{
		System.setProperty("wedriver.chrome.driver","C:\\\\Users\\\\HP\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		//create object of robot class
		Robot rbt=new Robot();
	
		rbt.keyPress(KeyEvent.VK_PAGE_DOWN);
		rbt.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(4000);
		rbt.keyPress(KeyEvent.VK_PAGE_DOWN);
		rbt.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(4000);
		rbt.keyPress(KeyEvent.VK_PAGE_DOWN);
		rbt.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		
		
	}
}
