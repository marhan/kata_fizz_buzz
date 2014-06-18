package de.kata.fizzbuzz;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();

    private List<Integer> expectedAsNumber = Arrays.asList(1, 2, 4, 8, 11, 13, 16, 17, 19);

    private List<Integer> expectedAsFizz = Arrays.asList(3, 6, 9, 12, 18);

    private List<Integer> expectedAsBuzz = Arrays.asList(5, 10, 20);

    private List<Integer> expectedAsFizzBuzz = Arrays.asList(15, 30, 45);

    private List<Integer> expectedAsWhizz = Arrays.asList(7, 14, 21, 28);

    @Test
    public void numbersExpected() {
        for (Integer number : expectedAsNumber) {
            assertThat(fizzBuzz.say(number), is(String.valueOf(number)));
        }
    }

    @Test
    public void fizzExpected() {
        assertNumbers(expectedAsFizz, "Fizz");
    }

    @Test
    public void buzzExpected() {
        assertNumbers(expectedAsBuzz, "Buzz");
    }

    @Test
    public void fizzBuzzExpected() {
        assertNumbers(expectedAsFizzBuzz, "FizzBuzz");
    }

    @Test
    public void whizzExpected() {
        assertNumbers(expectedAsWhizz, "Whizz");
    }

    private void assertNumbers(List<Integer> numbers, String expectation) {
        for (Integer number : numbers) {
            assertThat(fizzBuzz.say(number), is(expectation));
        }
    }
}
