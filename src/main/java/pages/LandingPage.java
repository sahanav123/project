package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[@title='My Account']")
	WebElement MyAccountButton;
	
	
	public WebElement MyAccountButton()
	{
		 return MyAccountButton;
		
	}
	
	@FindBy(linkText="Login")
	WebElement LoginButton;
	
	public WebElement LoginButton() {
		return LoginButton;
	}
	
	@FindBy(linkText="Register")
	WebElement RegisterButton;
	
	public WebElement RegisterButton() {
		return RegisterButton;
	}
	
	

}
