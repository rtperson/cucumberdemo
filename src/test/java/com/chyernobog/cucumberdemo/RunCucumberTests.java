package com.chyernobog.cucumberdemo;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
        snippets = SnippetType.CAMELCASE,
        glue = "com.chyernobog.cucumberdemo")
public class RunCucumberTests {
}
