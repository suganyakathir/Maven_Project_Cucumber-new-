package org.login;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	public LoginPage() {
		  PageFactory.initElements(driver, this);
	  }
	@FindBy(xpath="//button[@class='ToolbarButton']")
	private WebElement loginClk;
	@FindBy(xpath="//button[@role='button']")
	private WebElement signClk;
	@FindBy(id="username")
	private WebElement user;
	@FindBy(id="password")
	private WebElement pass;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement continuesClk;
	public WebElement getLoginClk() {
		return loginClk;
	}
	public WebElement getSignClk() {
		return signClk;
	}
	public WebElement getUser() {
		return user;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getContinuesClk() {
		return continuesClk;
	}
	
	
}
