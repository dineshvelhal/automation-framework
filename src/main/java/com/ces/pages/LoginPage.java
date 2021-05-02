package com.ces.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
	private WebDriver driver;
	
	private By userNameField = By.id("user");
	private By passwordField = By.id("password");
	private By loginButton = By.id("login");
	
	public LoginPage(WebDriver driver) {
		super(driver);
		
		this.driver = driver;
	}
	
	public void login(String userName, String password) {
		driver.findElement(userNameField).sendKeys(userName);
		driver.findElement(passwordField).sendKeys(password);
		driver.findElement(loginButton).click();
	}
}
