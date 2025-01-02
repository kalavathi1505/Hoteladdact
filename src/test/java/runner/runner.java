package runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\my pc\\eclipse-workspace\\Hoteladactine\\src\\test\\java\\Feature\\Adactine.feature",glue="")
public class runner {
	public static WebDriver driver;
	
	@BeforeClass
	public static void start()
	{
		driver= new ChromeDriver();
	}


}
