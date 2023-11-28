package org.hw12task2;

public class Main {
    public static void main(String[] args) {

        String title = "Fight Club";
        String author = "Chuck Palahniuk";
        int year = 1995;

        Readable book = () -> new Book(title, author, year);

        System.out.println(book.someBook());
    }
}
