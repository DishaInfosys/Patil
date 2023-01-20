package POM;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {
	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		//test data
		String expT="Amazon.com. Spend less. Smile more.";
		String actT=driver.getTitle();
		System.out.println(actT);
		if(expT.equals(actT)) {
			System.out.println("TC is Pass");
	
		}
		else {
			System.out.println("TC is Fail");
		}
		//maximize the browser
		Thread.sleep(4000);
		driver.manage().window().maximize();
		//close the browser
		Thread.sleep(4000);
		driver.close();
		
	}
	

}
