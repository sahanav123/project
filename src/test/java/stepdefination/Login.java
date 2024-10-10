package stepdefination;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Resource.Base;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LandingPage;
import pages.Loginconfirmpage;
import pages.Loginpage;


public class Login extends Base{
	
	WebDriver driver;
	 LandingPage LP;
	 Loginpage loginpage;
	 Loginconfirmpage Loginconfirmpage;
	
	
	@Given("^Open any Browser$")
    public void open_any_browser() throws IOException  {
		
		driver = initializeDriver();
        
    }
	
	 @And("^Navigate to Login page$")
	 public void navigate_to_login_page() throws InterruptedException  {
		 
		 driver.get(prop.getProperty("url"));
		 LP = new LandingPage(driver);
		 LP.MyAccountButton().click();
		 LP.LoginButton().click();
		 Thread.sleep(3000);
	       
	 }

    @When("^User enters username as \"([^\"]*)\" and password as \"([^\"]*)\" into the fields$")
    public void user_enters_username_as_something_and_password_as_something_into_the_fields(String email, String password)  {
    	
        loginpage = new Loginpage(driver);
    	loginpage.emailfield().sendKeys(email);
    	loginpage.passwordfield().sendKeys(password);
		
        
    }

    @And("^User clicks on Login button$")
    public void user_clicks_on_login_button()  {
    	
       
    	loginpage.creatingLoginButtonoption().click();
    	
    }
    
    @Then("^Verify user is able to successfully login$")
    public void verify_user_is_able_to_successfully_login() {
    	
        Loginconfirmpage = new Loginconfirmpage(driver);
        Assert.assertTrue(Loginconfirmpage.confirminglogin().isDisplayed());
    	
    }
    
    @After
    public void closure() {
    	
    	driver.close();
    	
    }

}