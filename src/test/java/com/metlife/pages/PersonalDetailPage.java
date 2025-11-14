package com.metlife.pages;

import com.metlife.hooks.AutomationHooks;
import org.openqa.selenium.WebDriver;

public class PersonalDetailPage {
    private final WebDriver driver;

    public PersonalDetailPage(AutomationHooks hooks) {
        this.driver = hooks.driver;
    }
}
