package de.kata.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();

    private List<Integer> expectedAsNumber = Arrays.asList(1, 2, 4, 7, 8, 11, 13, 14, 16, 17, 19);

    private List<Integer> expectedAsFizz = Arrays.asList(3, 6, 9, 12, 18);

    private List<Integer> expectedAsBuzz = Arrays.asList(5, 10, 20);

    private List<Integer> expectedAsFizzBuzz = Arrays.asList(15, 30, 45);

    @Test
    public void numbersExpected() {
        for (Integer number : expectedAsNumber) {
            assertThat(fizzBuzz.say(number), is(String.valueOf(number)));
        }
    }

    @Test
    public void fizzExpected() {
        for (Integer number : expectedAsFizz) {
            assertThat(fizzBuzz.say(number), is("Fizz"));
        }
    }

    @Test
    public void buzzExpected() {
        for (Integer number : expectedAsBuzz) {
            assertThat(fizzBuzz.say(number), is("Buzz"));
        }
    }

    @Test
    public void fizzBuzzExpected() {
        for (Integer number : expectedAsFizzBuzz) {
            assertThat(fizzBuzz.say(number), is("FizzBuzz"));
        }
    }
}
