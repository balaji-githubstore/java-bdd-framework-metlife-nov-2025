package com.metlife.pages;

import com.metlife.hooks.AutomationHooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * All common menu and other common element
 */
public class MainPage {
    private By pimLocator=By.xpath("//span[normalize-space()='PIM']");
    private final WebDriver driver;

    public MainPage(AutomationHooks hooks) {
        this.driver = hooks.driver;
    }

    public void clickOnPimPage()
    {
        driver.findElement(pimLocator).click();
    }
}
