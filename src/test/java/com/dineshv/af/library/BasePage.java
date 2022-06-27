package com.dineshv.af.library;

import com.dineshv.af.library.webui.WebLibrary;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;

@Log4j2
public class BasePage {
	protected WebDriver driver;
	WebLibrary webLib;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		webLib = new WebLibrary(driver);
		log.info("BasePage initiated with driver {}", driver.toString());
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
}
