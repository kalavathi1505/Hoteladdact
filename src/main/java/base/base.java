package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	public static WebDriver driver;
	
			
			public void click(WebElement element) {
			element.click();
		}
}
