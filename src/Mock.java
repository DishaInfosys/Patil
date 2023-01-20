import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mock {
	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//AUTOMATE search context
		driver.findElement(By.xpath("//input[@name='q']"));
		//automate the gmail link
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Gmail']"));
		//maximize
		driver.manage().window().maximize();
		
	}

}
