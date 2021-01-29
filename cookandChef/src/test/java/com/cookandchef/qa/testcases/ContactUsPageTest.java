package com.cookandchef.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cookandchef.qa.base.TestBase;
import com.cookandchef.qa.pages.ContactUsPage;
import com.cookandchef.qa.pages.HomePage;
import com.cookandchef.qa.pages.LoginPage;
import com.cookandchef.qa.util.TestUtil;

public class ContactUsPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	HomePage aboutPage;
	TestUtil testUtil;
	ContactUsPage contactsPage;

	public ContactUsPageTest() {
		super();
	}

	// test cases should be separated / Independent
	// Before each test cases -- launch the broswer
	// @Test -- execute the test case
	// After each test case -- close the browser
	@BeforeMethod
	public void setUP() {
		initialization();
		loginPage = new LoginPage();
		testUtil = new TestUtil();
		contactsPage = new ContactUsPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(priority = 1)
	public void verifyContactUsPageUrl() {
		Assert.assertEquals(contactsPage.verifyContactsUsURL(), "Contact Us Url is present");
	}

	@Test(priority = 2)
	public void verifyContactUsPageFunctionality() {
		Assert.assertEquals(contactsPage.verifyContactUSSendEmailFun(), "Contact Us Url is present");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
