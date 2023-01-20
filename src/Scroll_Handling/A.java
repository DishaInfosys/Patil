package Scroll_Handling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open the application
		driver.get("https://www.amazon.com/");
		//use javascript executer interface
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//scroll down
		
		jse.executeScript("window.scrollBy(0,8000);");
		//scroll up
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,-1000);");
		
	}

}
