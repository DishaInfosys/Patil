package Screenshots;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class scrnshot1 {
	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//typecast screenshot interface
		TakesScreenshot ts=(TakesScreenshot)driver;
		//take screenshot using getscreenshot method
		File src=ts.getScreenshotAs(OutputType.FILE);
		//create object of file class
		File dest=new File("D:\\SCREENSHOT\\GOOGLe.jpg");
		//we need to convert screenshot from src to destination
		Files.copy(src, dest);
		
		System.out.println("comment from github by teamleader");
		
		
		
		
	}

}
