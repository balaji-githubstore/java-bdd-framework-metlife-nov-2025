package com.metlife.pages;

import com.metlife.hooks.AutomationHooks;
import org.openqa.selenium.WebDriver;

public class PIMPage {
    private final WebDriver driver;

    public PIMPage(AutomationHooks hooks) {
        this.driver = hooks.driver;
    }


}
