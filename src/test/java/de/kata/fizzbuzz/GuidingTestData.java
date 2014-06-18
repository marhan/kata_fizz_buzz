package de.kata.fizzbuzz;

import java.util.HashMap;
import java.util.Map;

public class GuidingTestData {

    public Map<Integer, String> getReplacements() {
        if(replacements == null) {
            throw new IllegalStateException("The test data is not prepared.");
        }
        return replacements;
    }

    private Map<Integer, String> replacements;

    public void prepareForIteration1() {
        replacements = new HashMap<Integer, String>();

        replacements.put(3, "Fizz");
        replacements.put(5, "Buzz");
        replacements.put(6, "Fizz");
        replacements.put(9, "Fizz");
        replacements.put(10, "Buzz");
        replacements.put(12, "Fizz");
        replacements.put(15, "Fizz");
        replacements.put(18, "Fizz");
        replacements.put(20, "Buzz");
        replacements.put(21, "Fizz");
        replacements.put(24, "Fizz");
        replacements.put(25, "Buzz");
        replacements.put(27, "Fizz");
        replacements.put(30, "Fizz");
    }

    public void prepareForIteration2() {
        prepareForIteration1();

        replacements.put(15, "FizzBuzz");
        replacements.put(30, "FizzBuzz");
    }

    public void prepareForIteration3() {
        prepareForIteration2();

        replacements.put(7, "Whizz");
        replacements.put(14, "Whizz");
        replacements.put(21, "Whizz");
        replacements.put(28, "Whizz");
    }

    public Integer getHighestNumber() {
        Integer highestNumber = 0;
        for (Integer number : getReplacements().keySet()) {
            if (number > highestNumber) {
                highestNumber = number;
            }
        }
        return highestNumber;
    }

    public String getResultFor(Integer number) {
        if (number > getHighestNumber()) {
            String messageFormat = "Result not defined for numbers higher than: %s. Given was %s";
            throw new IllegalArgumentException(String.format(messageFormat, getHighestNumber(), number));
        }

        String result = getReplacements().get(number);
        if (result == null) {
            return String.valueOf(number);
        }

        return result;
    }

}
