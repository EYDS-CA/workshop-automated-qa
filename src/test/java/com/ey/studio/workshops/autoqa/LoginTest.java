package com.ey.studio.workshops.autoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import static org.testng.Assert.*;

public class LoginTest {
    WebDriver driver;

    By username = By.id("username");
    By password = By.id("password");
    By loginButton = By.cssSelector("button[type=\"submit\"]");
    By flashAlert = By.id("flash");

    @BeforeTest
    public void init() {
        driver = Util.chromeDriver();
    }

    @Test public void loginToPage() {
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(username).sendKeys("tomsmith");
        driver.findElement(password).sendKeys("SuperSecretPassword!");
        driver.findElement(loginButton).click();

        String expectedText = "You logged into a secure area!";
        assertEquals(
                driver.findElement(flashAlert).getText().substring(0, expectedText.length()), expectedText);
    }
}
