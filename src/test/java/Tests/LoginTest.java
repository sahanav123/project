package Tests;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Resource.Base;
import pages.LandingPage;
import pages.Loginconfirmpage;
import pages.Loginpage;

public class LoginTest extends Base {

	public WebDriver driver;
	Logger log = LogManager.getLogger(LoginTest.class.getName());

	@Test
	public void login() throws IOException {

		
		LandingPage LP = new LandingPage(driver);
		LP.MyAccountButton().click();
		log.debug("Clicked on myaccount button");
		LP.LoginButton().click();
		log.debug("clicked on login button");

		Loginpage loginpage = new Loginpage(driver);
		loginpage.emailfield().sendKeys(prop.getProperty("email"));
		log.debug("Entered email address");
		loginpage.passwordfield().sendKeys(prop.getProperty("password"));
		log.debug("Entered password");
		loginpage.creatingLoginButtonoption().click();
		log.debug("Clicked on continue button");

		Loginconfirmpage Loginconfirmpage = new Loginconfirmpage(driver);
		Assert.assertTrue(Loginconfirmpage.confirminglogin().isDisplayed());
		log.info("checking the succesful login message");

	}

	@BeforeMethod
	public void openapplication() throws IOException {
		driver = initializeDriver();
		log.debug("Chrome broeser launched");
		driver.get(prop.getProperty("url"));
		log.debug("application url launched");

	}

	@AfterMethod
	public void closure() {
		driver.quit();
		log.debug("application closed");

	}

}
