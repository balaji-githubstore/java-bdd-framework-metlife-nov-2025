package com.metlife.pages;

import com.metlife.hooks.AutomationHooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    private By quickLaunchLocator=By.xpath("//p[contains(normalize-space(),'Quick')]");

    private final WebDriver driver;

    public DashboardPage(AutomationHooks hooks) {
        this.driver = hooks.driver;
    }

    public String getQuickLaunchText()
    {
        return  driver.findElement(quickLaunchLocator).getText();
    }
}
