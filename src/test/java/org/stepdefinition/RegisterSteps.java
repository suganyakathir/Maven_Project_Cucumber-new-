package org.stepdefinition;

import java.util.List;

import org.base.BaseClass;
import org.login.LoginPage;
import org.login.RegistrationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps extends BaseClass {
	LoginPage l;
	static RegistrationPage r;
	@Given("The user should be in bigw register page")
	public void the_user_should_be_in_bigw_register_page() {
		browserLaunch("chrome");
		urlLaunch("https://www.bigw.com.au/");
		implicitWait(20);
		}
//	@Then("The user close the browser")
//	public void the_user_close_the_browser() {
//		closeBrowser();
//	    System.out.println("Browser was closed");
//	}
	@When("The user click the create new account button")
	public void the_user_click_the_create_new_account_button() {
		r=new RegistrationPage();
		l=new LoginPage();
		click(l.getLoginClk());
		click(r.getRegClk());
	    	}

	@When("The user has to fill the required details")
	public void the_user_has_to_fill_the_required_details(io.cucumber.datatable.DataTable data) {
		List<String> li = data.asList();
		sendkeys(r.getEmailid(),li.get(0));
		sendkeys(r.getPassword(),li.get(1));
	    }
	@When("The user has to click the {string} button")
	public void the_user_has_to_click_the_button(String button) {
	    click(r.getCrtmyAcc());
	   }

	@Then("The user should navigate to the user profile page")
	public void the_user_should_navigate_to_the_user_profile_page() {
		closeBrowser();
		System.out.println("user registered successfully");
		System.out.println("Browser was closed");
		driver.quit();
	    
	}
}
