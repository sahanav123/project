package Tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Resource.Base;
import pages.LandingPage;
import pages.RegisterAccountPage;
import pages.Registerconfirmpage;

public class RegisterTest extends Base {

	public WebDriver driver;

	@Test
	public void RegisterTest1() {

		LandingPage LandingPage = new LandingPage(driver);
		LandingPage.MyAccountButton().click();
		LandingPage.RegisterButton().click();

		RegisterAccountPage RegisterAccountPage = new RegisterAccountPage(driver);
		RegisterAccountPage.firstname().sendKeys("ss");
		RegisterAccountPage.lastname().sendKeys("k");
		RegisterAccountPage.registeremail().sendKeys("skora23@gmail.com");
		RegisterAccountPage.telephonenumber().sendKeys("2233221111");
		RegisterAccountPage.registerpassword().sendKeys("sskk");
		RegisterAccountPage.confirmregisterpassword().sendKeys("sskk");
		RegisterAccountPage.privacypolicybutton().click();
		RegisterAccountPage.continuebutton().click();

		Registerconfirmpage Registerconfirmpage = new Registerconfirmpage(driver);
		Assert.assertTrue(Registerconfirmpage.registeredsuccessfullmessage().isDisplayed());
		System.out.println(Registerconfirmpage.registeredsuccessfullmessage().isDisplayed());
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
