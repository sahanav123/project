package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	WebDriver driver;

	public Loginpage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "input-email")
	WebElement emailfield;

	public WebElement emailfield() {
		return emailfield;
	}

	@FindBy(id = "input-password")
	WebElement passwordfield;

	public WebElement passwordfield() {
		return passwordfield;
	}

	@FindBy(xpath = "//input[@value='Login']")
	WebElement creatingLoginButtonoption;

	public WebElement creatingLoginButtonoption() {
		return creatingLoginButtonoption;
	}

}
