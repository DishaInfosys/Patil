package Popups;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.ForkJoinPool.ManagedBlocker;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser_Popup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//handle the popup
			driver.findElement(By.xpath("//button[text()='✕']")).click();
			//search any mobile
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Mobiles under 20000",Keys.ENTER);
			//CLICK ON FIRST PHONE
			driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
			//print session id of main window we cant use gettitle method because child window is open so not able to print title of main window
			//print title of main window
			String stl=driver.getTitle();
			System.out.println(stl);
			//to print session id of main window from child window usw child browser popup steps
			Set<String> gwh=driver.getWindowHandles();
			//create object of arraylist class
			ArrayList<String> al=new ArrayList<String>(gwh);
			//print id of main window
			String sid=al.get(0);
			System.out.println(sid);
			//switch control on child popup to print session id of child window
			driver.switchTo().window(al.get(1));
			//print session id
			String sid2=al.get(1);
			System.out.println(sid2);
			//print title of child window
			String stl2=driver.getTitle();
			System.out.println(stl2);
			
			
			
	}

}
