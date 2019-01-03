package com.chyernobog.cucumberdemo;

import cucumber.api.java8.En;

import static org.junit.Assert.*;

public class FizzBuzzStepDefs implements En {
    private FizzBuzz fizzBuzz;

    public FizzBuzzStepDefs() {
        Given("FizzBuzz exists", () -> {
            fizzBuzz = new FizzBuzz();
        });

        When("FizzBuzz is running", () -> {
            fizzBuzz.runFizzBuzz();
        });

        Then("FizzBuzz counts to 100", () -> {
            for (int i = 1; i <= 100; i++) {
                if (i % 3 != 0 && i % 5 != 0) {
                    assertEquals(String.valueOf(i), fizzBuzz.getCount()[i]);
                }
            }
        });
    }
}
