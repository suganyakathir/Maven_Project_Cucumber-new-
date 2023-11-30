package org.login;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class RegistrationPage extends BaseClass{
	public RegistrationPage() {
		  PageFactory.initElements(driver, this);
	  }
	@FindBy(xpath="//button[text()='Register']")
	private WebElement regClk;
	@FindBy(id="email")
	private WebElement emailid;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(xpath="//button[text()='Create my account']")
	private WebElement crtmyAcc;
	public WebElement getRegClk() {
		return regClk;
	}
	public WebElement getEmailid() {
		return emailid;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getCrtmyAcc() {
		return crtmyAcc;
	}

}
