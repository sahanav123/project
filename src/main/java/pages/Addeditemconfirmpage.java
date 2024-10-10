package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addeditemconfirmpage {

	WebDriver driver;

	public Addeditemconfirmpage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	
	@FindBy(xpath="//div[text()='Success: You have added ']")
	WebElement confirmingaddtocartitem;
	
	public WebElement confirmingaddtocartitem() {
		return confirmingaddtocartitem;
	}

}
