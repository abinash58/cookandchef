package com.cookandchef.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cookandchef.qa.base.TestBase;

public class LoginPage extends TestBase {
	// Page Factory - Object Repository
	@FindBy(linkText = "Log In")
	WebElement homePageLogInBtn;

	@FindBy(id = "username")
	WebElement username;

	@FindBy(id = "pass_log_id")
	WebElement password;

	@FindBy(id = "pass_log_id")
	WebElement logInBtn;

	@FindBy(xpath = "//span[@class='pull-left']")
	WebElement cookandchefLogo;

	// Initializing Page Objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	// Actions:
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public Boolean validateCookandchefLogo() {
		return cookandchefLogo.isDisplayed();
	}

	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		username.sendKeys(pwd);
		logInBtn.click();
		return new HomePage();
	}
}
