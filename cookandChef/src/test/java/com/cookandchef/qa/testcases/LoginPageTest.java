package com.cookandchef.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cookandchef.qa.base.TestBase;
import com.cookandchef.qa.pages.HomePage;
import com.cookandchef.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUP() {
		initialization();
		loginPage = new LoginPage();
	}

	@Test(priority = 1)
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Cook and Chef | Find a Cook Online Of Your Choice");
	}

	@Test(priority = 2)
	public void cookAndChefLogoTest() {
		boolean flag = loginPage.validateCookandchefLogo();
		Assert.assertTrue(flag);
	}

	@Test(priority = 3)
	public void loginFunctionalityTest() {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
