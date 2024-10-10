package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginconfirmpage {
	
	
	
	WebDriver driver;
	public Loginconfirmpage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(linkText="Edit your account information")
	WebElement confirminglogin;
	
	public WebElement confirminglogin() {
		return confirminglogin;
	}

}
