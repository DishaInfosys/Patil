package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Drag_drop_element {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		//xpath of drag and drop element
				WebElement ele1=driver.findElement(By.xpath("//div[@id='draggable']"));
				WebElement ele2=driver.findElement(By.xpath("//div[@id='droppable']"));
				Thread.sleep(3000);
				//create object of action class
				Actions act = new Actions(driver);  //take "actions"
	            act.dragAndDrop(ele1,ele2).perform();
					
					
	}

}
