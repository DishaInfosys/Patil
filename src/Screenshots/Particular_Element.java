package Screenshots;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Particular_Element {
	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//take the Xpath of an element
		WebElement abc=driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		//use getscreenshot method
		
		File src = abc.getScreenshotAs(OutputType.FILE);
	//create the object of file class
		File dest=new File("D:\\\\SCREENSHOT\\\\particular element.jpg");
		//use copy method
		Files.copy(src, dest);
	
	
	
	
	
	
	
	
	}

}
