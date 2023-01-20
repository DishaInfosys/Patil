package selenium_Section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximize {
	public static void main(String[] args)throws Throwable {
		System.setProperty("windows.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*//get method
		driver.get("https://www.google.com/");
		//maximize the browser
		Thread.sleep(4000);
		driver.manage().window().maximize();
		//close method
		driver.close();*/
		
		driver.get("https://www.google.com/");
		Options opt=driver.manage();
		Window win=opt.window();
		win.maximize();
		
		
	}

}
