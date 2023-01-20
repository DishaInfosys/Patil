package selenium_Section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import net.bytebuddy.implementation.EqualsMethod;
import net.bytebuddy.matcher.EqualityMatcher;

public class ActiTime { 
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		//enter username
		driver.findElement(By.id("username")).sendKeys("admin");
		//enter password
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//click on login button
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		//maximize
		driver.manage().window().maximize();
		//expected title
		String expT=("actiTIME - Login");
		String actT=driver.getTitle();
		System.out.println(actT); 
		
	
		if(expT.equals(actT)) {
			System.out.println("TC is pass");
			
		}
		else {
			System.out.println("TC is fail");
		
		}
		
		
		
		
		
	}

}
