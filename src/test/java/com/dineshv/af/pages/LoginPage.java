package com.dineshv.af.pages;

import com.dineshv.af.BasePage;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class LoginPage {
	private By userNameField = By.id("user");
	private By passwordField = By.id("password");
	private By loginButton = By.id("login");
	
	public LoginPage() throws InterruptedException {
		log.info("LoginPage initiated with driver {}");
		//Thread.sleep(2000);
	}

	@Step("Login to App")
	public void login(String userName, String password) throws InterruptedException {
		log.info("perform login with userName{}", userName);

		//Thread.sleep(2000);
	}

	public String getTitle() {
		return "Login";
	}
}
