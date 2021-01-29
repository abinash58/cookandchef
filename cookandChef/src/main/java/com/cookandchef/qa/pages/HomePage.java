package com.cookandchef.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cookandchef.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(name = "job_types")
	WebElement jobType;

	@FindBy(name = "cuisines")
	WebElement cusinesType;

	@FindBy(name = "localities")
	WebElement areaLocation;

	@FindBy(name = "search")
	WebElement searchBtn;

	@FindBy(xpath = "//a[@href='about.php']")
	WebElement aboutBtn;

	@FindBy(className = "fa fa-sign-out")
	WebElement signOutBtn;

	@FindBy(xpath = "//a[@href='contact.php']")
	WebElement contactUs;

	// Initializing the object
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyHomePageTitle() {
		return driver.getTitle();
	}

	public String clickOnAboutUsLinks() {
		aboutBtn.click();
		return driver.getTitle();

	}

	public ContactUsPage clickOnContactLinks() {
		contactUs.click();
		return new ContactUsPage();

	}

}
