package com.chyernobog.cucumberdemo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

public class FizzBuzzStepDefs {

    private FizzBuzz fizzBuzz;

    @Given("FizzBuzz exists")
    public void fizzBuzzExists() {
        fizzBuzz = new FizzBuzz();
    }

    @When("FizzBuzz is running")
    public void fizzBuzzIsRunning() {
        fizzBuzz.runFizzBuzz();
    }

    @Then("FizzBuzz counts to 100")
    public void fizzBuzzCountsToN() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                assertEquals(String.valueOf(i), fizzBuzz.getCount()[i]);
            }
        }
    }

    @When("^(\\w+) is divisible by (\\w+)$")
    public void countIsDivisibleByThree(String count, String three) {
        assert(Integer.valueOf(count) % Integer.valueOf(three) == 0);
    }

    @Then("^FizzBuzz prints out (\\w+) for (\\w+)$")
    public void fizzBuzzPrintsOutFizz(String result, String count) {
        String res = fizzBuzz.getCount()[Integer.valueOf(count)];
        assert(res.equalsIgnoreCase(result));
    }

}
