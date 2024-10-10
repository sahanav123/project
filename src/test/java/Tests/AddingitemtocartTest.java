package Tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Resource.Base;
import pages.Addeditemconfirmpage;
import pages.Addingitemtocartpage;
import pages.LandingPage;
import pages.Loginconfirmpage;
import pages.Loginpage;

public class AddingitemtocartTest extends Base {

	public WebDriver driver;

	@Test
	public void Additemtocart() throws InterruptedException {

		LandingPage LandingPage = new LandingPage(driver);
		LandingPage.MyAccountButton().click();
		LandingPage.LoginButton().click();

		Loginpage Loginpage = new Loginpage(driver);
		Loginpage.emailfield().sendKeys(prop.getProperty("email"));
		Loginpage.passwordfield().sendKeys(prop.getProperty("password"));
		Loginpage.creatingLoginButtonoption().click();

		Loginconfirmpage Loginconfirmpage = new Loginconfirmpage(driver);
		Assert.assertTrue(Loginconfirmpage.confirminglogin().isDisplayed());
		
		
		Addingitemtocartpage Addingitemtocartpage = new Addingitemtocartpage(driver);
		Addingitemtocartpage.Tabletoption().click();
		Addingitemtocartpage.itemname().click();
		Addingitemtocartpage.quantity().sendKeys("2");
		Addingitemtocartpage.addtocartbutton().click();
		
		Addeditemconfirmpage Addeditemconfirmpage = new Addeditemconfirmpage(driver);
		Assert.assertTrue(Addeditemconfirmpage.confirmingaddtocartitem().isDisplayed());

	}

	@BeforeMethod
	public void openapplication() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}

	@AfterMethod
	public void closure() {
		driver.quit();
	}

}
