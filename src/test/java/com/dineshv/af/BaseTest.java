package com.dineshv.af;

import com.dineshv.af.library.webui.DriverFactory;
import com.dineshv.af.library.webui.Browser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	// protected WebDriver driver;

	@BeforeMethod
	public void setup() throws Exception {
		Thread.sleep(2000);
	}

	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
	}
}
