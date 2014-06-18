package de.kata.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzGuidingTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setup() {
        fizzBuzz = new FizzBuzz();
    }

/*
    @Test
    public void iterateOverTestData() {
        GuidingTestData guidingTestData = new GuidingTestData();
        guidingTestData.prepareForIteration3();

        for (int i = 1; i <= guidingTestData.getHighestNumber(); i++) {
            String expected = guidingTestData.getResultFor(i);
            String output = fizzBuzz.say(i);
            assertThat(String.format("Expectation failed for %s", i), output, is(expected));
        }
    }
*/
}
