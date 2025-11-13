package com.metlife.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = {"src/test/resources/feature/"}
        ,glue = {"com.metlife.steps","com.metlife.hooks"}
//        ,dryRun = true
//        ,publish = true
        ,plugin = {"pretty","html:target/cucumber-report.html"}
//        ,tags = "@employee"
)
public class RunnerTest extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
