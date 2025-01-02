package stepdefinition;

import org.openqa.selenium.WebDriver;

import base.base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pom.pom;
import runner.runner;

public class stepdefinition extends base{
	public static WebDriver driver = runner.driver;
	pom ob = new pom(driver);
	
	@Given("Open Adactine page")
	public void open_adactine_page() {
		driver.get("https://adactinhotelapp.com/");
	}

	@Then("Click on New Register")
	public void click_on_new_register() {
		click(ob.getNewUser());
		
	    
	}


}
