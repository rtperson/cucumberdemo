package com.chyernobog.cucumberdemo;

import io.cucumber.java8.En;

import static org.junit.Assert.*;

public class FizzBuzzStepDefs implements En {
    private FizzBuzz fizzBuzz;

    public FizzBuzzStepDefs() {
        Given("FizzBuzz exists", () -> fizzBuzz = new FizzBuzz());

        When("FizzBuzz is running", () -> fizzBuzz.runFizzBuzz());

        Then("FizzBuzz counts to 100", () -> {
            for (int i = 1; i <= 100; i++) {
                if (i % 3 != 0 && i % 5 != 0) {
                    assertEquals(String.valueOf(i), fizzBuzz.getCount()[i]);
                }
            }
        });

        When("{int} is divisible by {int}", (Integer count, Integer three) -> {
            assert(count % three == 0);
        });

        Then("FizzBuzz prints out {word} for {int}", (String result, Integer count) -> {
            String res = fizzBuzz.getCount()[count];
            assert(res.equalsIgnoreCase(result));
        });
    }
}