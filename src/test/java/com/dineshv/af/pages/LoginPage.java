package com.dineshv.af.pages;

import com.dineshv.af.library.BasePage;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class LoginPage extends BasePage {
	private By userNameField = By.id("user");
	private By passwordField = By.id("password");
	private By loginButton = By.id("login");
	
	public LoginPage(WebDriver driver) {
		super(driver);
		log.info("LoginPage initiated with driver {}", driver.toString());
	}
	
	public void login(String userName, String password) {
		log.info("perform login with userName{}", userName);
		driver.findElement(userNameField).sendKeys(userName);
		driver.findElement(passwordField).sendKeys(password);
		driver.findElement(loginButton).click();
	}
}
