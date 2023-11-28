package org.hw12task3;

public class Main {
    public static void main(String[] args) {

        Operation add = (a, b) -> a + b;
        Operation sub = (a, b) -> a - b;
        Operation mul = (a, b) -> a * b;

        Operation div = (a, b) -> {
            if (b == 0) throw new IllegalArgumentException("Division by zero!");
            return (double) a / b;
        };

        Operation pow = (a, b) -> Math.pow(a, b);
        Operation nRoot = (a, b) -> Math.round(Math.pow(a, (double) 1 / b));

        System.out.println(add.provideOperation(125, 5));
        System.out.println(sub.provideOperation(10, 1));
        System.out.println(mul.provideOperation(10, 10));
        System.out.println(div.provideOperation(64, 8));
        System.out.println(pow.provideOperation(2, 8));
        System.out.println(nRoot.provideOperation(125,3));
    }
}
