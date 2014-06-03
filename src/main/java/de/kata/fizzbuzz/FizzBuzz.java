package de.kata.fizzbuzz;

public class FizzBuzz {

    public String say(int i) {

        StringBuilder builder = new StringBuilder();

        boolean isFizz = isFizz(i);
        if (isFizz) {
            builder.append("Fizz");
        }

        boolean isBuzz = isBuzz(i);
        if (isBuzz) {
            builder.append("Buzz");
        }

        if(!isFizz && ! isBuzz) {
            builder.append(String.valueOf(i));
        }

        return builder.toString();
    }

    private boolean isBuzz(int i) {
        return i % 5 == 0;
    }

    private boolean isFizz(int i) {
        return i % 3 == 0;
    }
}
