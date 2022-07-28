package com.dineshv.af.tests;

import static org.testng.Assert.assertEquals;

import com.dineshv.af.config.ApplicationConfig;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

import com.dineshv.af.BaseTest;
import com.dineshv.af.pages.LoginPage;

public class LoginTests extends BaseTest{

	@Epic("Authentication")
	@Feature("Login")
	@Test
	public void test1() throws InterruptedException {
		// driver.get(ApplicationConfig.APP_URL);

		LoginPage loginPage = new LoginPage();

		loginPage.login("admin", "admin");
		
		assertEquals(loginPage.getTitle(), "Login");
	}

	@Epic("Authentication")
	@Feature("Login")
	@Test
	public void test2() throws InterruptedException {

		LoginPage loginPage = new LoginPage();

		loginPage.login("admin", "admin1");
		
		assertEquals(loginPage.getTitle(), "Login");
	}

	@Epic("Authentication")
	@Feature("Login")
	@Test
	public void test3() throws InterruptedException {
		// driver.get(ApplicationConfig.APP_URL);

		LoginPage loginPage = new LoginPage();

		loginPage.login("admin", "admin");

		assertEquals(loginPage.getTitle(), "Login");
	}

	@Epic("Authentication")
	@Feature("Login")
	@Test
	public void test4() throws InterruptedException {

		LoginPage loginPage = new LoginPage();

		loginPage.login("admin", "admin1");

		assertEquals(loginPage.getTitle(), "Login");
	}

	@Epic("Authentication")
	@Feature("Login")
	@Test
	public void test5() throws InterruptedException {
		// driver.get(ApplicationConfig.APP_URL);

		LoginPage loginPage = new LoginPage();

		loginPage.login("admin", "admin");

		assertEquals(loginPage.getTitle(), "Login");
	}

	@Epic("Authentication")
	@Feature("Login")
	@Test
	public void test6() throws InterruptedException {

		LoginPage loginPage = new LoginPage();

		loginPage.login("admin", "admin1");

		assertEquals(loginPage.getTitle(), "Login");
	}

	@Epic("Authentication")
	@Feature("Login")
	@Test
	public void test7() throws InterruptedException {
		// driver.get(ApplicationConfig.APP_URL);

		LoginPage loginPage = new LoginPage();

		loginPage.login("admin", "admin");

		assertEquals(loginPage.getTitle(), "Login");
	}

	@Epic("Authentication")
	@Feature("Login")
	@Test
	public void test8() throws InterruptedException {

		LoginPage loginPage = new LoginPage();

		loginPage.login("admin", "admin1");

		assertEquals(loginPage.getTitle(), "Login");
	}

	@Epic("Authentication")
	@Feature("Login")
	@Test
	public void test9() throws InterruptedException {
		// driver.get(ApplicationConfig.APP_URL);

		LoginPage loginPage = new LoginPage();

		loginPage.login("admin", "admin");

		assertEquals(loginPage.getTitle(), "Login");
	}

	@Epic("Authentication")
	@Feature("Login")
	@Test
	public void test10() throws InterruptedException {

		LoginPage loginPage = new LoginPage();

		loginPage.login("admin", "admin1");

		assertEquals(loginPage.getTitle(), "Login");
	}

	@Epic("Authentication")
	@Feature("Login")
	@Test
	public void test11() throws InterruptedException {
		// driver.get(ApplicationConfig.APP_URL);

		LoginPage loginPage = new LoginPage();

		loginPage.login("admin", "admin");

		assertEquals(loginPage.getTitle(), "Login");
	}

	@Epic("Authentication")
	@Feature("Login")
	@Test
	public void test12() throws InterruptedException {

		LoginPage loginPage = new LoginPage();

		loginPage.login("admin", "admin1");

		assertEquals(loginPage.getTitle(), "Login");
	}

	@Epic("Authentication")
	@Feature("Login")
	@Test
	public void test13() throws InterruptedException {
		// driver.get(ApplicationConfig.APP_URL);

		LoginPage loginPage = new LoginPage();

		loginPage.login("admin", "admin");

		assertEquals(loginPage.getTitle(), "Login");
	}

	@Epic("Authentication")
	@Feature("Login")
	@Test
	public void test14() throws InterruptedException {

		LoginPage loginPage = new LoginPage();

		loginPage.login("admin", "admin1");

		assertEquals(loginPage.getTitle(), "Login");
	}

	@Epic("Authentication")
	@Feature("Login")
	@Test
	public void test15() throws InterruptedException {
		// driver.get(ApplicationConfig.APP_URL);

		LoginPage loginPage = new LoginPage();

		loginPage.login("admin", "admin");

		assertEquals(loginPage.getTitle(), "Login");
	}

	@Epic("Authentication")
	@Feature("Login")
	@Test
	public void test16() throws InterruptedException {

		LoginPage loginPage = new LoginPage();

		loginPage.login("admin", "admin1");

		assertEquals(loginPage.getTitle(), "Login");
	}
}
