package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterAccountPage {

	WebDriver driver;

	public RegisterAccountPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "input-firstname")
	WebElement firstname;

	public WebElement firstname() {
		return firstname;
	}
	
	@FindBy(id="input-lastname")
	WebElement lastname;
	
	public WebElement lastname() {
		return lastname;
	}
	
	@FindBy(id="input-email")
	WebElement registeremail;
	
	public WebElement registeremail() {
		return registeremail;
	}
	
	@FindBy(id="input-telephone")
	WebElement telephonenumber;
	
	public WebElement telephonenumber() {
		return telephonenumber;
	}
	
	@FindBy(id="input-password")
	WebElement registerpassword;
	
	public WebElement registerpassword() {
		return registerpassword;
	}
	
	@FindBy(id="input-confirm")
	WebElement confirmregisterpassword;
	
	public WebElement confirmregisterpassword() {
		return confirmregisterpassword;
		
	}
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement privacypolicybutton;
	
	public WebElement privacypolicybutton() {
		return privacypolicybutton;
	}
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	WebElement continuebutton;
	
	public WebElement continuebutton() {
		return continuebutton;
	}
	
	
	
	
	
	

}
