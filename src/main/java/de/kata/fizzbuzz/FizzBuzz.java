package de.kata.fizzbuzz;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class FizzBuzz {

    private TreeMap<Integer, String> replacements = new TreeMap<>();

    public FizzBuzz() {
        replacements.put(7, "Whizz");
        replacements.put(15, "FizzBuzz");
        replacements.put(3, "Fizz");
        replacements.put(5, "Buzz");
    }

    public String say(Integer number) {

        if(isReplaceable(number)) {
           return replace(number);
        }

        return String.valueOf(number);
    }

    private String replace(Integer number) {

        for(Integer key : replacements.descendingKeySet()){
            if(number % key == 0) {
               return replacements.get(key);
            }
        }

        return null;
    }

    private boolean isReplaceable(Integer number) {
        return replace(number) != null;
    }
}
