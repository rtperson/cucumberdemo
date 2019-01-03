package com.chyernobog.cucumberdemo;

import cucumber.api.java8.En;

import static org.junit.Assert.*;

public class FizzBuzzStepDefs implements En {
    private FizzBuzz fizzBuzz;

    public FizzBuzzStepDefs() {
        Given("FizzBuzz exists", () -> {
            fizzBuzz = new FizzBuzz();
        });
    }
}
