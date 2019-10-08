package cucumber.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.cucumber.runner.TestRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.baseclass.BaseClass;
import cucumber.pom.LoginPage;

public class StepDefinition extends BaseClass{
public static WebDriver driver = TestRunner.driver;

	@Given("^User should be in Facebook Application$")
	public void user_should_be_in_Facebook_Application() throws Throwable {
	    getUrl("http://www.facebook.com");
	}

	@Then("^User should see the Facebook logo displayed in the header$")
	public void user_should_see_the_Facebook_logo_displayed_in_the_header() throws Throwable {
		LoginPage lp = new LoginPage(driver);
		elementisDisplayed(lp.getFbLOgo());
	    
	}

	@When("^User enter the Email address in the emailfield in Login Page$")
	public void user_enter_the_Email_address_in_the_emailfield_in_Login_Page() throws Throwable {
		LoginPage lp = new LoginPage(driver);
		setkey(lp.getEmailfield(), "jnv@gmail.com");
	    
	}

	@When("^User enter the password in the passwordFeild in Login Page$")
	public void user_enter_the_password_in_the_passwordFeild_in_Login_Page() throws Throwable {
	    LoginPage lp = new LoginPage(driver);
	    setkey(lp.getPasswordfield(), "123456");
	}

	@When("^User click on the Login button in the Login Page$")
	public void user_click_on_the_Login_button_in_the_Login_Page() throws Throwable {
		
	    LoginPage lp = new LoginPage(driver);
	    clickElement(lp.getClick());
	}

	@When("^User wait for (\\d+) seconds for page load$")
	public void user_wait_for_seconds_for_page_load(int arg1) throws Throwable {
		Thread.sleep(1000);
	  
	}

	@Then("^User should see the Login into Facebook title in the Forgot Password Page$")
	public void user_should_see_the_Login_into_Facebook_title_in_the_Forgot_Password_Page() throws Throwable {
	    
	}


}



