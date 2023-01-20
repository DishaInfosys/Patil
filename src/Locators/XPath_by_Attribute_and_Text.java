package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_by_Attribute_and_Text {
	public static void main(String[] args)throws Throwable {
		//set the properties
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		//enter username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		//enter password
		//Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		//click on login button
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		//navigate user should enter on home page
		String expectedT="actiTIME - Login";
		String actualT=driver.getTitle();
		System.out.println(actualT);
		if(expectedT.equals(actualT)) {
			System.out.println("TC is Pass");
		}
		else {
			System.out.println("TC is fail");
		}

				
		
		
		
		
		
		
		
	}

}
