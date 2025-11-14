package com.metlife.pages;

import com.metlife.hooks.AutomationHooks;
import org.openqa.selenium.WebDriver;

public class ResetPasswordPage {
    private final WebDriver driver;

    public ResetPasswordPage(AutomationHooks hooks) {
        this.driver = hooks.driver;
    }
}
