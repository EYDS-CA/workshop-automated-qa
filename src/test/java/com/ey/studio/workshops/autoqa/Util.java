package com.ey.studio.workshops.autoqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Util {
    static WebDriver chromeDriver() {
        ChromeOptions options = new ChromeOptions();
        // Comment out this line to see the browser actions locally
        options.setHeadless(true);

        return new ChromeDriver(options);
    }
}
