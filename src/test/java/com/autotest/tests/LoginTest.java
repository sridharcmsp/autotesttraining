package com.autotest.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.autotest.pages.AccountPage;
import com.autotest.pages.HomePage;

public class LoginTest {

	@Test
	public void testLoginFeature() throws Exception {
		String username = "deepthiaerramshetty@gmail.com";
		String password = "selenium1";
		String acctInfoTxt = "Hi,";

		// 1.Create Driver object
		WebDriver driver = new FirefoxDriver();

		// 2. Initialize Acct Page
		AccountPage accountPage = new AccountPage(driver);

		// 3. Initialize HomePage
		HomePage homePage = new HomePage(driver);
		// 3. Navigate to home page
		homePage.navigate();

		// 4. Click sign in button
		homePage.clickLoginLink();

		// 5. Login with username and password

		homePage.login(username, password);

		// 6. Assert account info
		// a) Initialize account Info
		// b) get account Info and compare

		assertEquals(acctInfoTxt, accountPage.getAccountInfo());

	}

}
