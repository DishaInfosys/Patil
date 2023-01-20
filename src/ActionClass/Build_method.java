package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Build_method {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//choose the target element
		WebElement target = driver.findElement(By.xpath("//a[text()='Gmail']"));
		//create object of action class
		Actions act=new Actions(driver);
		//all method in single step using build method and perform method
		act.moveToElement(target).contextClick().doubleClick().perform();
	}

}
