package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		//enter customer id
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12354");
		//click on submit button
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		//to handle alert popup first switch control from webpage to popup
		Alert alt=driver.switchTo().alert();
		alt.accept();
		//alt.dismiss();
		//print message on popup
		String s1=alt.getText();
		System.out.println(s1);
		//click on ok button
		alt.accept();
		
		
		
		
		
	}
	

}
