package Section2;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_Handling {
	public static void main(String[] args)throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//open the app
	driver.get("https://www.facebook.com/");
	//click on create new account button
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		//select day listbox
		Thread.sleep(4000);
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		//create object of select class
		Select s=new Select(day);
		Thread.sleep(4000);
		//use select class methods
		//s.selectByIndex(5);//it gives data at particular index
		s.selectByValue("15");
		//select by visible text
		//s.selectByVisibleText("");
		//select month listbox
		//Thread.sleep(4000);
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));

		//create object of select class
		Select sm=new Select(month);
		Thread.sleep(4000);
		//use select class method
		sm.selectByVisibleText("Jul");
		//select year listbox
		Thread.sleep(4000);
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		Select sy=new Select(year);
		Thread.sleep(4000);
		//use the select class method
		sy.selectByValue("2000");
		

		
		
		
		
		
		
	}

}
