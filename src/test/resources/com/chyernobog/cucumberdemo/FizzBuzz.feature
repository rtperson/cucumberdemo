Feature: Is FizzBuzz Working?

  Scenario: FizzBuzz exists
    Given FizzBuzz exists

  Scenario: FizzBuzz counts to 100
    Given FizzBuzz exists
    When FizzBuzz is running
    Then FizzBuzz counts to 100

