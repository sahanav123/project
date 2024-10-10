package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addingitemtocartpage {
	WebDriver driver;

	public Addingitemtocartpage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	
	@FindBy(linkText="Tablets")
	WebElement Tabletoption;
	public WebElement Tabletoption() {
		return Tabletoption;
	}
	
	@FindBy(linkText ="Samsung Galaxy Tab 10.1")
	WebElement itemname;
	
	public WebElement itemname() {
		return itemname;
	}
	
	@FindBy(id="input-quantity")
	WebElement quantity;
	
	public WebElement quantity() {
		return quantity;
	}
	
	@FindBy(id="button-cart")
	WebElement addtocartbutton;
	
	public WebElement addtocartbutton() {
		return addtocartbutton;
	}

}
