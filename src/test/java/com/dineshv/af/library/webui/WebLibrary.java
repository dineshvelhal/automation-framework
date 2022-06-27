package com.dineshv.af.library.webui;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;

@Log4j2
public class WebLibrary {
    WebDriver driver;

    public WebLibrary(WebDriver driver) {
        this.driver = driver;
        log.info("WebLibrary initiated with driver {}", driver.toString());
    }
}
