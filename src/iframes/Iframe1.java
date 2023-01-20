package iframes;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Iframe1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//maximize the browser
		driver.manage().window().maximize();
		//switch selenium focus from webpage to 1st iframe
		driver.switchTo().frame("packageListFrame");
		//for our confirmation take any element on first frame and print it
	String t1=driver.findElement(By.xpath("//h2[text()='Packages']")).getText();
	System.out.println(t1);   //Packages
	//switch control from 1st frame to main webpage
	driver.switchTo().defaultContent();
	//switch control from main webpage to 2nd iframe
	driver.switchTo().frame("packageFrame");
	//TAke any element and print it
	String t2=driver.findElement(By.xpath("//a[text()='FindAll']")).getText();
		System.out.println(t2);  //findall
		//switch control from frame to main webpage
		driver.switchTo().defaultContent();
		//switch control from main wepage to 3rd iframe
		driver.switchTo().frame("classFrame");
		//Take any element and print it
		String t3=driver.findElement(By.xpath("//span[text()='Interface Summary']")).getText();
		System.out.println(t3);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
