package com.chyernobog.cucumberdemo;

public class FizzBuzz {

    private String[] count = new String[101];

    public String[] getCount() {
        return count;
    }

    public void runFizzBuzz() {
        countToOneHundred();
        applyFizz();
        applyBuzz();
    }

    private void countToOneHundred() {
        for (int i = 1; i <= 100; i++) {
            count[i] = String.valueOf(i);
        }
    }

    private void applyFizz() {
        for (int i = 3; i <= 100; i+= 3) {
            count[i] = "Fizz";
        }
    }

    private void applyBuzz() {
        for (int i = 5; i <= 100; i+= 5) {
            if (count[i].equals("Fizz")) {
                count[i] = count[i].concat("Buzz");
            } else {
                count[i] = "Buzz";
            }
        }
    }


}
