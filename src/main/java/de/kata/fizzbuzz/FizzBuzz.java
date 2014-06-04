package de.kata.fizzbuzz;

public class FizzBuzz {

    public String say(int i) {
        return isFizzBuzz(i) ? "FizzBuzz" : isFizz(i) ? "Fizz" : isBuzz(i) ? "Buzz" : String.valueOf(i);
    }

    private boolean isFizzBuzz(int i) {
        return isFizz(i) && isBuzz(i);
    }

    private boolean isBuzz(int i) {
        return i % 5 == 0;
    }

    private boolean isFizz(int i) {
        return i % 3 == 0;
    }
}
