package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_section1 {
	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//get method
		driver.get("https://www.google.com/");
		//maximize the browser
		Thread.sleep(4000);
		//driver.manage().window().maximize();
		//close method
		//driver.close();
		
	}

}
