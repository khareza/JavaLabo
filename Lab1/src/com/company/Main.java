package com.company;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        int randomInc = r.nextInt(100);

        out.println("Wprowadź pierwszy element:");
        double startNumber = in.nextDouble();

        out.println("Wprowadź ilość elementów:");
        int n = in.nextInt();

	    out.println("Wylosowana wartość: " + randomInc);
        double sum = startNumber;
        for (int i = 0; i < n; i++) {
            sum += randomInc;
        }

        out.println("Suma: " + sum);
    }
}


