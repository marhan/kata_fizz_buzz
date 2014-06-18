package de.kata.fizzbuzz;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class FizzBuzz {

    public String say(Integer number) {

        if (number % 5 == 0) {
            return "Buzz";
        }

        if (number % 3 == 0) {
            return "Fizz";
        }

        return String.valueOf(number);
    }
}
