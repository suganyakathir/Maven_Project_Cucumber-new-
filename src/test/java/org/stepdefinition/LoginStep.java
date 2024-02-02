package org.stepdefinition;
import java.util.*;

import org.base.BaseClass;
import org.junit.Assert;
import org.login.LoginPage;
import org.login.RegistrationPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LoginStep extends BaseClass {
//	WebDriver driver;
	LoginPage l;
	RegistrationPage r;
	@Given("The user should be in bigw login")
	public void the_user_should_be_in_bigw_login() {
		browserLaunch("chrome");
		urlLaunch("https://www.bigw.com.au/");
		implicitWait(20);
		}
	
	@When("The user has to click account button")
	public void the_user_has_to_click_account_button() {
		l=new LoginPage();
		click(l.getLoginClk());
		click(l.getSignClk());
	}
    @When("The user has to enter the {string} and {string}")
	public void the_user_has_to_enter_the_and(String user, String pass) {
	     l=new LoginPage();
		sendkeys(l.getUser(),user);
		sendkeys(l.getPass(),pass);
	}
    @When("The user has to click {string} button")
    public void the_user_has_to_click_button(String button) {
    	if(button.equals("login")) {
        click(l.getContinuesClk());
	}
    	else if(button.equals("create my account")) {
    		click(RegisterSteps.r.getCrtmyAcc());
    	}
    	else {
    		throw new NoSuchElementException();
    	}
    }
     @Then("The user should navigate to the invalid login page")
	public void the_user_should_navigate_to_the_invalid_login_page() {
	    WebDriverWait w= new WebDriverWait(driver,20);
		 waitForUrl(20,"login?state");
		Assert.assertTrue("verify invalid login",driver.getCurrentUrl().contains("login?state"));
	    
	    System.out.println("user in Invalid Page");
	    closeBrowser();
//    	 Assert.assertTrue(true);
//    	 System.out.println("successfully login");
//    	 driver.quit();
	}
     
	


}
