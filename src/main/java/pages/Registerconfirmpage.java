package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registerconfirmpage {
	
	
	
	WebDriver driver;
	public Registerconfirmpage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//h1[text()='Your Account Has Been Created!']")
	WebElement registeredsuccessfullmessage;
	
	public WebElement registeredsuccessfullmessage() {
		return registeredsuccessfullmessage;
	}

}
