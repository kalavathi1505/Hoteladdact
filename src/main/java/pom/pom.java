package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom {

WebDriver driver;
	
	public pom(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath=("//a[.='New User Register Here']"))
	private WebElement NewUser;
 
	public WebElement getNewUser() {
		return NewUser;
	}

}
