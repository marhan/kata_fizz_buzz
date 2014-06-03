package de.kata.fizzbuzz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setup() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void oneIsOne() {
        String output = fizzBuzz.say(1);
        assertThat(output, is("1"));
    }

    @Test
    public void twoIsTwo() {
        String output = fizzBuzz.say(2);
        assertThat(output, is("2"));
    }

    @Test
    public void threeIsFizz() {
        String output = fizzBuzz.say(3);
        assertThat(output, is("Fizz"));
    }

    @Test
    public void fourIsFour() {
        String output = fizzBuzz.say(4);
        assertThat(output, is("4"));
    }

    @Test
    public void fiveIsBuzz() {
        String output = fizzBuzz.say(5);
        assertThat(output, is("Buzz"));
    }

    @Test
    public void fifthTeenIsFizzBuzz() {
        String output = fizzBuzz.say(15);
        assertThat(output, is("FizzBuzz"));
    }


}
