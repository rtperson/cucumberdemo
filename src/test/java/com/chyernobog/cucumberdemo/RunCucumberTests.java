package com.chyernobog.cucumberdemo;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = "com.chyernobog.cucumberdemo")
public class RunCucumberTests {
}
