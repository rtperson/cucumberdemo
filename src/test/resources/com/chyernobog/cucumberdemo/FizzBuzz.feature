Feature: Is FizzBuzz Working?

  Scenario: FizzBuzz exists
    Given FizzBuzz exists

  Scenario: FizzBuzz counts to 100
    Given FizzBuzz exists
    When FizzBuzz is running
    Then FizzBuzz counts to 100

  Scenario Outline: FizzBuzz prints "Fizz" when count divisible by three
    Given FizzBuzz exists
    And FizzBuzz is running
    When <count> is divisible by <three>
    Then FizzBuzz prints out <result> for <count>
    Examples:
      | count | three     | result |
      | 3     | 3         | Fizz   |
      | 12    | 3         | Fizz   |

