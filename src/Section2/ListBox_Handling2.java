package Section2;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_Handling2 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\HP\\\\\\\\Downloads\\\\\\\\chromedriver_win32 (1)\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open application
		driver.get("https://www.amazon.com/");
		//maximize the window
		driver.manage().window().maximize();
		//handle search list box
		WebElement all=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		//create object of select class
		Thread.sleep(4000);
		Select s=new Select(all);
		s.selectByVisibleText("Electronics");
		//select language
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("span[style='visibility: visible;']")).click();
		//Thread.sleep(4000);
		WebElement lang=driver.findElement(By.cssSelector("span[style='visibility: visible;']"));//no need to use click
		//handle listbox
		Thread.sleep(4000);
		Select sl=new Select(lang);
		sl.selectByVisibleText("Deutsch");
		
		
		
		
		
		
		
		
		
	}

}
