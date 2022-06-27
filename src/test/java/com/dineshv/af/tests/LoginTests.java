package com.dineshv.af.tests;

import static org.testng.Assert.assertEquals;

import com.dineshv.af.config.ApplicationConfig;
import org.testng.annotations.Test;

import com.dineshv.af.BaseTest;
import com.dineshv.af.pages.LoginPage;

public class LoginTests extends BaseTest{

	@Test
	public void successful_login_test() {
		driver.get(ApplicationConfig.APP_URL);

		LoginPage loginPage = new LoginPage(driver);

		loginPage.login("admin", "admin");
		
		assertEquals(loginPage.getTitle(), "Order Pizza");
	}

	@Test
	public void unsuccessful_login() {
		driver.get(ApplicationConfig.APP_URL);

		LoginPage loginPage = new LoginPage(driver);

		loginPage.login("admin", "admin1");
		
		assertEquals(loginPage.getTitle(), "Login");
	}
}
