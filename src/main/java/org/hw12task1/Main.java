package org.hw12task1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int koef = 10;
        List<Double> numbers = Arrays.asList(
                Math.random() * koef, Math.random() * koef,
                Math.random() * koef, Math.random() * koef,
                Math.random() * koef, Math.random() * koef,
                Math.random() * koef, Math.random() * koef,
                Math.random() * koef, Math.random() * koef);

        double result = numbers
                .stream()
                .map(x -> x * x)
                .reduce(0.0, (tempSum, element) -> tempSum + element);

        System.out.println((int)result);
    }
}
