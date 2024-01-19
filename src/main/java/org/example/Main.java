package org.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public int sumFunction(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}