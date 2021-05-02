package com.ces.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.ces.base.BaseTest;
import com.ces.config.Config;
import com.ces.pages.LoginPage;

public class LoginTests extends BaseTest{

	@Test
	public void successful_login_test() {
		driver.get(Config.baseUrl);

		LoginPage loginPage = new LoginPage(driver);

		loginPage.login("admin", "admin");
		
		assertEquals(loginPage.getTitle(), "Order Pizza");
	}

	@Test
	public void unsuccessful_login() {
		driver.get(Config.baseUrl);

		LoginPage loginPage = new LoginPage(driver);

		loginPage.login("admin", "admin1");
		
		assertEquals(loginPage.getTitle(), "Login1");
	}
}
