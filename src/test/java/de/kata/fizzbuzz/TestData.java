package de.kata.fizzbuzz;

import java.util.HashMap;
import java.util.Map;

public class TestData {

    private static Map<Integer, String> testData;
    private static Integer maxNumber;

    static {
        testData = new HashMap<Integer, String>();

        testData.put(3, "Fizz");
        testData.put(5, "Buzz");
        testData.put(6, "Fizz");
        testData.put(9, "Fizz");
        testData.put(10, "Buzz");
        testData.put(12, "Fizz");
        testData.put(15, "FizzBuzz");
        testData.put(18, "Fizz");
        testData.put(20, "Buzz");

        maxNumber = getHighestNumber();
    }

    private static Integer getHighestNumber() {
        Integer highestNumber = 0;
        for (Integer number : testData.keySet()) {
            if (number > highestNumber) {
                highestNumber = number;
            }
        }
        return highestNumber;
    }

    public static String getResultFor(Integer number) {

        if (number > maxNumber) {
            String messageFormat = "Result not defined for numbers higher than: %s. Given was %s";
            throw new IllegalArgumentException(String.format(messageFormat, maxNumber, number));
        }

        String result = testData.get(number);
        if (result == null) {
            return String.valueOf(number);
        }

        return result;
    }

    public static Integer getMaxNumber() {
        return maxNumber;
    }
}
