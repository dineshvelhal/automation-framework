package com.dineshv.af.library;

import com.dineshv.af.library.webui.Browser;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverLogLevel;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverLogLevel;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

@Builder
@Log4j2
@ToString
public class DriverFactory {
    // private WebDriver driver = null;

    @Getter(AccessLevel.PUBLIC)
    @Builder.Default
    private String browser = Browser.CHROME;

    /**
     * Maximizes the browser window if not already maximized
     */
    @Getter(AccessLevel.PUBLIC)
    @Builder.Default
    private boolean maximizeWindow = true;

    /**
     * Whether Grid based remote execution is needed
     */
    @Getter(AccessLevel.PUBLIC)
    @Builder.Default
    private boolean remote = false;

    /**
     * if remote is set to true then gridURL is used to create RemoteWebDriver
     * */
    @Getter(AccessLevel.PUBLIC)
    @Builder.Default
    private String gridURL = "";

    /**
     * Browser runs in headless mode if this field is set to true
     */
    @Getter(AccessLevel.PUBLIC)
    @Builder.Default
    private boolean headless = false;

    /**
     * Define (true/false) if browser should accept insecure certificates
     */
    @Getter(AccessLevel.PUBLIC)
    @Builder.Default
    private boolean acceptInsecureCerts = false;

    /**
     * Define (true/false) if browser should accept insecure certificates
     */
    @Getter(AccessLevel.PUBLIC)
    @Builder.Default
    private boolean enableConsoleLogs = false;

    public WebDriver initialize() throws Exception {
        log.info("Creating a WebDriver instance");
        WebDriver driver;

        ChromeOptions chromeOptions = getChromeOptions();

        FirefoxOptions firefoxOptions = getFirefoxOptions();

        if(remote) {
            // Instantiate a remote driver
            switch(browser) {
                case Browser.CHROME:
                    driver = new RemoteWebDriver(new URL(gridURL), chromeOptions);
                    break;
                case Browser.FIREFOX:
                    driver = new RemoteWebDriver(new URL(gridURL), firefoxOptions);
                    break;
                default:
                    throw new Exception("Invalid browser name");
            }
        } else {
            // Instantiate a local driver
            switch(browser) {
                case Browser.CHROME:
                    driver = new ChromeDriver(chromeOptions);
                    break;
                case Browser.FIREFOX:
                    driver = new FirefoxDriver(firefoxOptions);
                    break;
                default:
                    throw new Exception("Invalid browser name");
            }
        }

        if(maximizeWindow) {
            driver.manage().window().maximize();
        }

        System.out.println(this);
        return driver;
    }

    private FirefoxOptions getFirefoxOptions() {
        FirefoxOptions options = new FirefoxOptions();

        options.setHeadless(headless);
        options.setAcceptInsecureCerts(acceptInsecureCerts);
        if(enableConsoleLogs) {
            options.setLogLevel(FirefoxDriverLogLevel.DEBUG);
        }

        return options;
    }

    private ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();

        options.setHeadless(headless);
        options.setAcceptInsecureCerts(acceptInsecureCerts);
        if(enableConsoleLogs) {
            options.setLogLevel(ChromeDriverLogLevel.ALL);
        }

        return options;
    }
}
