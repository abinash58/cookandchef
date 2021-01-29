package com.cookandchef.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cookandchef.qa.base.TestBase;

public class ContactUsPage extends TestBase {

	@FindBy(xpath = "//p[contains(text(),'Contact')]")
	WebElement contactUsPageLable;

	@FindBy(name = "name")
	WebElement enterNameInConatctUsPage;

	@FindBy(name = "mobile")
	WebElement enterMobileNumberInConatctUsPage;
	@FindBy(name = "email")
	WebElement enterEmailIdInConatctUsPage;

	@FindBy(name = "msg")
	WebElement enterMessageInContactUsPage;

	@FindBy(id = "submit")
	WebElement clickOnSubmitButton;

	public String verifyContactsUsURL() {

		LoginPage.initialization();
		contactUsPageLable.click();
		String contactUsTitle = driver.getTitle();
		return contactUsTitle;

	}

	public String verifyContactUSSendEmailFun() {
		LoginPage.initialization();
		contactUsPageLable.click();
		enterNameInConatctUsPage.sendKeys("Test accnt");
		enterEmailIdInConatctUsPage.sendKeys("test1@yopmail.com");
		enterMobileNumberInConatctUsPage.sendKeys("8568542582");
		enterMessageInContactUsPage.sendKeys("Test message");
		clickOnSubmitButton.click();
		driver.switchTo().alert().accept();
		String contactUsTitle = driver.getTitle();
		return contactUsTitle;
	}
}
